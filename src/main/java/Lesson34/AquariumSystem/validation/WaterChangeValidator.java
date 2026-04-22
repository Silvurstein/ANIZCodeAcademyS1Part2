package Lesson34.AquariumSystem.validation;


public class WaterChangeValidator {

    public static void validate(String note) {
        NoteValidator.validate(note, 60);
    }
}