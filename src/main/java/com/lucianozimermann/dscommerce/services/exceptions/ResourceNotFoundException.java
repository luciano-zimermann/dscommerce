package com.lucianozimermann.dscommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException( String message )
    {
        super( message );
    }
}
