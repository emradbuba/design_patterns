package io.github.guit4rfre4k.designpatterns.abstractfactory.main;

import io.github.guit4rfre4k.designpatterns.abstractfactory.factory.AbstractEmailPartsFactory;
import io.github.guit4rfre4k.designpatterns.abstractfactory.model.Email;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class EmailGenerator {

    private EmailGenerator() {
        // do not create instances
    }

    public static Email generateEmail(AbstractEmailPartsFactory emailComposerFactory, URL fileURL) {
        String emailContent = getContentFromFile(fileURL);
        String emailGreeting = emailComposerFactory.getGreeting();
        String emailEnding = emailComposerFactory.getEnding();
        String emailSignature = emailComposerFactory.getSignature();

        return new Email(emailGreeting, emailContent, emailEnding, emailSignature);
    }


    private static String getContentFromFile(URL fileUrl) {

        StringBuilder sb = new StringBuilder();
        try {
            File file = Paths.get(fileUrl.toURI()).toFile();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (IOException | URISyntaxException e) {
            return "Content could not be loaded: " + e.getMessage();
        }
    }
}
