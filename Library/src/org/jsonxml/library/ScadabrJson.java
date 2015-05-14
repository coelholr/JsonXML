/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jsonxml.library;

import java.io.BufferedReader;
import java.io.IOException;
import org.json.JSONObject;
import org.openide.util.Exceptions;

/**
 *
 * @author C1237932
 */
public class ScadabrJson {

    public static String ConvertToScadabrJson(JSONObject jSONObject, BufferedReader br) {
        String textToChange = jSONObject.toString();
        String line1;
        String line2;
        try {
            while ((line1 = br.readLine()) != null) {
                line2 = br.readLine();
                textToChange = textToChange.replace(line1, line2);
            }

        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return textToChange;

    }
}
