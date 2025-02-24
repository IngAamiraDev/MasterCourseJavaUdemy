package com.ingaamira.modules.lambda.project_format;

import com.ingaamira.modules.lambda.project_format.models.Format;

public class ExampleLambdaFormat {

    public static void main(String[] args) {

        Format format = sentence -> {
            return sentence.replace(".", "")
                    .replace(",", "").replace(" ", "")
                    .toUpperCase();
        };

        String result = format.cleaning("In Cancun, you can explore the Pink Zone, visit the Coco Bongo club, " +
                "and go to different malls. You can also visit 'Delfines' Beach, where you can swim, take photos from the viewpoint, " +
                "play, relax, walk on the beach, eat, and enjoy other activities.");
        System.out.println(result);

    }
    
}
