package Week_1;

public class DefineEnhancementAnnotation {
    public static void main(String[] args) {
        // Displaying the annotations applied
        displayAnnotationInfo(DataProcessor.class);
        displayAnnotationInfo(LanguageSupport.class);
    }

    // Method to display annotation information
    private static void displayAnnotationInfo(Class<?> cls) {
        if (cls.isAnnotationPresent(EnhancementRequest.class)) {
            EnhancementRequest er = cls.getAnnotation(EnhancementRequest.class);
            System.out.println("Class: " + cls.getSimpleName());
            System.out.println("ID: " + er.id());
            System.out.println("Synopsis: " + er.synopsis());
            System.out.println("Engineer: " + er.engineer());
            System.out.println("Date: " + er.date());
            System.out.println("---------------------------------");
        }
    }

}

