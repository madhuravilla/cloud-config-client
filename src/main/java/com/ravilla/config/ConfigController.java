/**
 * 
 */
package com.ravilla.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author madhu
 *
 */

@RestController
@Validated
@RequiredArgsConstructor
@NoArgsConstructor
public class ConfigController {
	
	@Autowired
    AppConfig appConfig;

    @GetMapping("/name")
    public String getMethod() throws RuntimeException {
        return appConfig.getName();

    }

}
