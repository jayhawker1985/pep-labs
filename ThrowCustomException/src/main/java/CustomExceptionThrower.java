
public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     * @param Hi 
     */
    public void throwCustomException(String message) throws CustomException{
        try {
            message = ""; //may throw exception
        }
        catch(Exception e) {
            throw new CustomException("An exception has occured!");
        }
    }

    public void CustomException() {
    }

}
