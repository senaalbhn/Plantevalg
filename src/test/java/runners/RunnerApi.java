package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
        "html:target/default-cucumber-reports1.html",
        "json:target/json-reports/cucumber1.json",
        "junit:target/xml-report/cucumber1.xml",
        "rerun:TestOutput/failed_scenario.txt"  },
        /*
        -rerun plugin'i ile fail olan scenarioları failed_scenario.txt dosyası içinde tutabiliriz.
        -Paralel çalıştırmalar sonucu detaylı rapor alabilmek için Runner classlarındaki rapor isimlerini
        yukarıdaki gibi değiştirmemiz gerekir. Böylece raporları üstüste yazmamış olur ve çalıştırdığımız
        her ruuner için ayrı ayrı tekbir html sayfasında raporu görebiliriz
         */
        features = "src/test/resources/apiFeatures", //features package'ının yolu (content root)
        glue = "stepDefinitions", //stepDefinitions package ismi
        tags = "@api1", //Hangi scenarioları bu tag'ı belirtirsek o scenariolar çalışır
        dryRun = false, //true seçersek scenariolari kontrol eder browser'ı çalıştırmaz
        monochrome = false//-->true kullanırsak konsoldaki çıktıları tek renk(siyah) olarak verir
)

public class RunnerApi {

    /*
        @CucumberOptions() bu notasyon sayesinde hangi scenariolari çalıştıracağımızı ve hangi raporları
    alacağımızı belirtiriz
        dryRun parametresi eğer true seçilirse scenariolari çalıştırmadan feature file daki steplerin
    stepDefinition class'ındaki methodlar ile uyuşuğ uyuşmadığını kontrol eder ve browser'ı çalıştırmaz
     */


}