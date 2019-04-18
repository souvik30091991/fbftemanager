package com.feedbackrecorder.app.exceptions;

public class FeedbackRecSequenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errCode;
	private String errMsg;

	public FeedbackRecSequenceException(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
