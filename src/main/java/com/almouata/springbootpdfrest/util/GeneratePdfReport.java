package com.almouata.springbootpdfrest.util;

import com.almouata.springbootpdfrest.bean.City;
import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * Created by ALmouatass on 18/12/2017.
 */
@Slf4j
public class GeneratePdfReport {
    public static ByteArrayInputStream citiesReport(List<City> cities) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try{

            log.debug("Create Simple PDF file with Text");

            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();

            doc.addPage(page);

            PDPageContentStream content = new PDPageContentStream(doc, page);

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 26);
            content.moveTextPositionByAmount(220, 750);
            content.drawString("Cities List");
            content.endText();

            for (int i =0 ; i< cities.size(); i++ ){
                content.beginText();
                content.setFont(PDType1Font.HELVETICA, 16);
                content.moveTextPositionByAmount(80, 700 -(i*25));
                content.drawString(cities.get(i).getName());
                content.endText();

                content.beginText();
                content.setFont(PDType1Font.HELVETICA, 16);
                content.moveTextPositionByAmount(160, 700-(i*25));
                content.drawString(""+cities.get(i).getPopulation());
                content.endText();

            }


            content.close();
            doc.save(out);
            doc.close();



            System.out.println("your file created in : "+ System.getProperty("user.dir"));

        }
        catch(IOException  e){

            System.out.println(e.getMessage());

        }
        return new ByteArrayInputStream(out.toByteArray());
    }
}
