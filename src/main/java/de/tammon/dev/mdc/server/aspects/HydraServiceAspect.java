/*
 * Copyright (c) 2015. Tammo Schwindt (Tammon) <dev@tammon.de>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.tammon.dev.mdc.server.aspects;

import de.tammon.dev.mdc.server.service.HydraService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by tammschw on 20/06/15.
 */
@Aspect
@Component
public class HydraServiceAspect {

    @Before("de.tammon.dev.mdc.server.aspects.Pointcuts.allCommunicatingMethodsWithinHydraService()")
    public void setHydraSettings(JoinPoint joinPoint) {
        ((HydraService) joinPoint.getThis()).setHydraSettings();
    }
}
