package web;

import com.aventstack.extentreports.utils.FileUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Evidencia {


    public void print(WebDriver driver,String dataHora, String casoDeTeste, String nomePrint) throws IOException {

        File foto = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(foto, new File("target/print/"+dataHora+"/"+casoDeTeste+"/"+nomePrint+"/"+".png"));

    }


}
