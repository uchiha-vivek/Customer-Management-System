package com.cms.cms.exception;

public class CustomerClassNotFoundException  extends RuntimeException {

public CustomerClassNotFoundException()
{
    super();
}

public CustomerClassNotFoundException(String message){
    super(message);
}

}
