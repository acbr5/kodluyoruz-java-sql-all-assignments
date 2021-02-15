/*
Havanın sıcaklığına göre hava durumu bilgisini ekrana yazdıran programı yazınız.

Durumlar:

    Hava sıcaklığı 20 derecenin altındaysa soğuk
    Hava sıcaklığı 20 ve 30 değerleri dahil olmak üzere bu aralıktaysa ılık
    Hava sıcaklığı 30'dan yüksek değerlerde ise sıcak olarak baz alınacak ve ekrana hava sıcaklığı ile ilgili bilgi yazdırılacak.
 */

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONException;

public class Soru2 {

// Bu kısmı Internet'ten araştırarak yazdım. Bilgileri toparlamak için biraz uğraştım ama değdi.
// Openweathermap üzerinden anlık olarak Istanbul için sıcaklık bilgisi çekmektedir.
    private double getWeatherOnJSON(){
        String API_KEY = "25e585073d9232f10fa66afa76d62fda";
        String LOCATION = "istanbul";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + LOCATION + "&appid=" + API_KEY + "&units =imperial";

        double celcius = 0;
        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            rd.close();

            JSONObject jsonObject = new JSONObject(result.toString());
            //System.out.println(jsonObject);
            JSONObject main = jsonObject.getJSONObject("main");
            double temp = main.getDouble("temp");
            // Kelvin cinsinden sıcaklık döndürmektedir. 1 kelvin = -273.15 celcius

            celcius = temp-273.15;

        } catch (IOException | JSONException e) {
            System.out.println(e.getMessage());
        }
        return celcius;
    }

    private void sicaklikDurum(double sicaklik){
        if (sicaklik < 20){
            System.out.println("Uvvv, hava soğuk. Sıkı giyinin :)");
        }
        else if (sicaklik >= 20 && sicaklik <= 30){
            System.out.println("Hava ne sıcak ne soğuk, ılık. Immm mis gibi ilkbahar havası :)");
        }
        else if (sicaklik > 30){
            System.out.println("Hava gerçekten sıcak. Dalga seslerini duyar gibiyim :)");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Soru2 nesne = new Soru2();

        System.out.print("Dereceyi kendiniz mi girmek istersiniz(1), Internet üzerinden sıcaklığı çekelim mi(2)? ");
        int derece = scanner.nextInt();

        double sicaklik = 0;

        switch (derece){
            case 1:
                System.out.print("Lütfen dereceyi giriniz: ");
                sicaklik = scanner.nextInt();
                break;
            case 2:
                sicaklik = nesne.getWeatherOnJSON();
                break;
            default:
                System.out.println("Lütfen sadece 1 veya 2 rakamından birisine basınız!");
        }
        System.out.println();

        nesne.sicaklikDurum(sicaklik);
    }
}