package com.rimsnet.springboot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rimsnet.springboot.jpa.entities.Payment;
import com.rimsnet.springboot.jpa.serviceImpl.PaymentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@ApiOperation(value = "Save employee")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Successfully Saved Payment.", response = PaymentController.class),
			@ApiResponse(code = 500, message = "Internal server error.", response = Exception.class),
			@ApiResponse(code = 404, message = "Unable to find payments", response = Exception.class) })
	@PostMapping(value = "/savePayment")
	public ResponseEntity<Object> saveAllPayments(@RequestBody Payment employee) {

		paymentService.savePayment(employee);

		return new ResponseEntity<Object>("Successfully Saved", HttpStatus.OK);
	}

}
