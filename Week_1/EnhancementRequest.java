package Week_1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EnhancementRequest {
    int id();
    String synopsis();
    String engineer() default "unassigned";
    String date() default "unknown";
}
