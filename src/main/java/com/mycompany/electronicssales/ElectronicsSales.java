/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicssales;

/**
 *
 * @author emeris
 */
public class ElectronicsSales {

    public static void main(String[] args) {

        // Cape Town sales
        int capeTownPS5 = 1000;
        int capeTownXbox = 2000;
        int capeTownSwitch = 3000;

        // Port Elizabeth sales
        int portElizabethPS5 = 2000;
        int portElizabethXbox = 3000;
        int portElizabethSwitch = 1200;

        // Pretoria sales
        int pretoriaPS5 = 1500;
        int pretoriaXbox = 1100;
        int pretoriaSwitch = 1200;

        // Calculate total sales for each city
        int capeTownTotal = capeTownPS5 + capeTownXbox + capeTownSwitch;
        int portElizabethTotal = portElizabethPS5 + portElizabethXbox + portElizabethSwitch;
        int pretoriaTotal = pretoriaPS5 + pretoriaXbox + pretoriaSwitch;

        // Display the sales report
        System.out.println("NUMBER 1 ELECTRONICS FRANCHISE");
        System.out.println("YEARLY SALES REPORT");
        System.out.println("-----------------------------------------------");

        System.out.println("City\t\tPS5\tXbox\tSwitch\tTotal");
        System.out.println("-----------------------------------------------");

        System.out.println("Cape Town\t" + capeTownPS5 + "\t" + capeTownXbox
                + "\t" + capeTownSwitch + "\t" + capeTownTotal);

        System.out.println("Port Elizabeth\t" + portElizabethPS5 + "\t" + portElizabethXbox
                + "\t" + portElizabethSwitch + "\t" + portElizabethTotal);

        System.out.println("Pretoria\t" + pretoriaPS5 + "\t" + pretoriaXbox
                + "\t" + pretoriaSwitch + "\t" + pretoriaTotal);

        // Determine the city with the most sales
        String cityWithMostSales;

        if (capeTownTotal > portElizabethTotal && capeTownTotal > pretoriaTotal) {
            cityWithMostSales = "Cape Town";
        } 
        else if (portElizabethTotal > capeTownTotal && portElizabethTotal > pretoriaTotal) {
            cityWithMostSales = "Port Elizabeth";
        } 
        else {
            cityWithMostSales = "Pretoria";
        }

        // Display the city with the most sales
        System.out.println("-----------------------------------------------");
        System.out.println("City with the most sales: " + cityWithMostSales);
    }
}

/*

*/

