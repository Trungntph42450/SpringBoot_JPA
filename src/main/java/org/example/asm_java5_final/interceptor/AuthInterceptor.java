package org.example.asm_java5_final.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.asm_java5_final.entity.Account;
import org.example.asm_java5_final.entity.RoleDetail;
import org.example.asm_java5_final.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Autowired
    SessionService session;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // TODO Auto-generated method stub
        String uri = request.getRequestURI();
        Account account = session.get("user");
        String error = "";

        if(account == null) {
            error = "Please Login";
        }else {
            for(RoleDetail roleDetail : account.getRoleDetails()) {
                if(roleDetail.getRole().getRole().equals("user") && uri.startsWith("/admin")) {
                    error = "Access Denied";
                    break;
                }
            }
        }

        if(error.length() > 0) {
            session.set("security-uri", uri);
            response.sendRedirect("/login?message="+error);
            return false;
        }
        return true;
    }
}
