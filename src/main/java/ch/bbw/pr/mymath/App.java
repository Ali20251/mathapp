// Ali Olayan
package ch.bbw.pr.mymath;

import ch.bbw.pr.mathlib.Volumes;
import ch.bbw.pr.stringlib.StringUtils;

public class App {
    public static void main(String[] args) {
        Volumes volumes = new Volumes();
        System.out.printf("Zylinder (r=2, h=5): %.4f%n", volumes.cylinder(2.0, 5.0));
        System.out.printf("Wuerfel (a=3): %.4f%n", volumes.cube(3.0));
        System.out.printf("Kugel (r=3): %.4f%n", volumes.sphere(3.0));

        StringUtils stringUtils = new StringUtils();
        System.out.println("Reversed 'Maven': " + stringUtils.reverse("Maven"));
        System.out.println("'Anna' ist Palindrom: " + stringUtils.isPalindrome("Anna"));
    }
}
