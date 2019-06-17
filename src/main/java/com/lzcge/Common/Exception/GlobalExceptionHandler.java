package com.lzcge.Common.Exception;

import com.lzcge.Common.Result.JsonResult;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);


	/**
	 * 处理所有不可知的异常
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public JsonResult handleException(Exception e){
		LOGGER.error(e.getMessage(),e);
		JsonResult jsonResult = new JsonResult();
		jsonResult.setFail("操作失败!");
		return jsonResult;
	}


	/**
	 * 处理业务异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(BusinessException.class)
	@ResponseBody
	public JsonResult handleBusinessException(BusinessException e){
		LOGGER.error(e.getMessage(),e);
		JsonResult jsonResult = new JsonResult();
		jsonResult.setData(e.getMessage());
//		jsonResult.setFail(e.getMessage());
		return jsonResult;
	}

	/**
	 * 处理所有接口数据验证异常
	 *
	 * @param e
	 * @return
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public JsonResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
		LOGGER.error(e.getMessage(), e);
		JsonResult response = new JsonResult();
//		response.setFail(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
		response.setData(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
		return response;
	}


}
