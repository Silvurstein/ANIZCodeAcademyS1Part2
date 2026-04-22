package Lesson33.ExceptionHierarchyDesignPrincip.Exceptions;

public class OverloadException extends BikeException {
    public OverloadException() {
        super("Hit the gym you fat fuck");
    }
}
