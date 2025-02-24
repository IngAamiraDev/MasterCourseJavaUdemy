package com.ingaamira.modules.lambda.project_count_words;

import java.util.Collections;
import com.ingaamira.modules.lambda.project_count_words.models.CountWord;
public class main {
    public static void main(String[] args) {

        CountWord count = sentence -> {

            String[] array = sentence.replace(".", "")
                    .replace(",", "")
                    .toLowerCase()
                    .split(" ");

            int max = 0;
            String word = null;
            for (int i = 0; i < array.length; i++) {
                int row = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i].equalsIgnoreCase(array[j])) {
                        row++;
                    }
                }

                if(row > max){
                    max = row;
                    word = array[i];
                }
            }
            return Collections.singletonMap(word, max);
        };
        count.countWords("In Cancun, you can explore the Pink Zone, visit the Coco Bongo club, " +
                        "and go to different malls. You can also visit 'Delfines' Beach, where you can swim, take photos from the viewpoint, " +
                        "play, relax, walk on the beach, eat, and enjoy other activities.")
                .forEach( (k, v) -> System.out.println("The sentences that is repeated the most is: " + k + " count: " + v));
    }

}
