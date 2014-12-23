
         <subsystem xmlns="urn:jboss:domain:security:1.2">
            <security-domains>
                <security-domain name="AuthSD" cache-type="default">
                    <authentication>
                        <login-module code="org.jboss.security.auth.spi.UsersRolesLoginModule" flag="required">
                            <module-option name="usersProperties" value="${jboss.server.config.dir}/auth-users.properties"/>
                            <module-option name="rolesProperties" value="${jboss.server.config.dir}/auth-roles.properties"/>
                        </login-module>
                    </authentication>
                </security-domain>
			<!--....-->
           </subsystem>