package Java高级.day05.异常和线程.异常.自定义异常;

public class RegisterException extends RuntimeException{
    public RegisterException()
    {
        super();
    }
    public RegisterException(String message)
    {
        super(message);
    }

}
    