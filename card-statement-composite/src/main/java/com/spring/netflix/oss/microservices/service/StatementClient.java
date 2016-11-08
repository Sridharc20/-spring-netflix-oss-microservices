/**
 * 
 */
package com.spring.netflix.oss.microservices.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Sridhar.C
 *
 */
@FeignClient(name="statement-service")
public interface StatementClient extends StatementService {

}
