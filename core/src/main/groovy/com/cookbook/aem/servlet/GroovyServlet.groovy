package com.cookbook.aem.servlet

import groovy.util.logging.Slf4j
import org.apache.felix.scr.annotations.sling.SlingServlet
import org.apache.sling.api.SlingHttpServletRequest
import org.apache.sling.api.SlingHttpServletResponse
import org.apache.sling.api.servlets.SlingSafeMethodsServlet

import javax.servlet.ServletException

@Slf4j
@SlingServlet(paths = ['/bin/groovy/hello'])
class GroovyServlet extends SlingSafeMethodsServlet {


    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println("Hello from the groovy servlet")

        log.info("Logging from the groovy servlet")
    }

}