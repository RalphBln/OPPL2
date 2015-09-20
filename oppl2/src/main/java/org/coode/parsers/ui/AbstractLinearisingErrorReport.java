package org.coode.parsers.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luigi Iannone
 */
public abstract class AbstractLinearisingErrorReport implements ErrorReport {

    @Override
    public int getLinearisedPosition(String text) {
        int toReturn = getCharPositionInLine();
        BufferedReader reader = new BufferedReader(new StringReader(text));
        List<String> lines = new ArrayList<>();
        String line = null;
        String lineSeparator = System.getProperty("line.separator");
        try {
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = 1; i < getLine(); i++) {
                // Add one for the new line char
                toReturn += lines.get(i - 1).length() + lineSeparator.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toReturn;
    }
}
