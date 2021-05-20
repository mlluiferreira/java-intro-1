package com.grupo4.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    public static void main(String[] args) {
        int iArr[] = {16223, 898,18, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        iArr = radixSort(iArr);

        for(int i : iArr){
            System.out.println(i + " ");
        }
    }

    private static int[] radixSort(int[] iArr) {
        String sArr[] = fromIntArrayToStingArray(iArr);
        int length = returnBiggerValue(iArr);
        sArr = addPaddingZero(sArr, length);
        for(int i = length; i > 0; i--) {
            sArr = orderListByPosition(sArr, i-1);
        }

        return fromStringArrayToIntArray(sArr);
    }

    private static String[] fromIntArrayToStingArray(int[] iArr){
        String sArr[] = new String[iArr.length];

        for(int i = 0;  i < iArr.length ; i++){
           sArr[i] = iArr[i]+"";
        }

        return sArr;
    }


    private static int[] fromStringArrayToIntArray(String[] sArr){
        int iArr[] = new int[sArr.length];
        for (int i=0; i<sArr.length; i++){
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        return iArr;
    }

    private static int returnBiggerValue(int[] iArr){
        int numero = iArr[0];
        for(int i = 1;  i < iArr.length ; i++){
            if(numero < iArr[i]){
                numero = iArr[i];
            }
        }
        return (numero+"").length();
    }

    private static String[] addPaddingZero(String[] sArr, int tamanho){

        for (int i = 0; i < sArr.length; i++){
            if(sArr[i].length() < tamanho){
                for(int j = sArr[i].length(); j < tamanho ; j++){
                    sArr[i] = "0"+sArr[i];
                }
            }
        }

        return sArr;
    }

    private static String[] orderListByPosition(String[] sArr, int position){
        List<String> l0 = new ArrayList<String>();
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        List<String> l3 = new ArrayList<String>();
        List<String> l4 = new ArrayList<String>();
        List<String> l5 = new ArrayList<String>();
        List<String> l6 = new ArrayList<String>();
        List<String> l7 = new ArrayList<String>();
        List<String> l8 = new ArrayList<String>();
        List<String> l9 = new ArrayList<String>();

        for (int i = 0; i< sArr.length; i++){
            char lastDigit = sArr[i].charAt(position);

            if(lastDigit == '0'){
                l0.add(sArr[i]);
            }else if(lastDigit == '1'){
                l1.add(sArr[i]);
            }else if(lastDigit == '2'){
                l2.add(sArr[i]);
            }else if(lastDigit == '3'){
                l3.add(sArr[i]);
            }else if(lastDigit == '4'){
                l4.add(sArr[i]);
            }else if(lastDigit == '5'){
                l5.add(sArr[i]);
            }else if(lastDigit == '6'){
                l6.add(sArr[i]);
            }else if(lastDigit == '7'){
                l7.add(sArr[i]);
            }else if(lastDigit == '8'){
                l8.add(sArr[i]);
            }else if(lastDigit == '9'){
                l9.add(sArr[i]);
            }
        }

        List<String> listFinal = new ArrayList<>();
        listFinal.addAll(l0);
        listFinal.addAll(l1);
        listFinal.addAll(l2);
        listFinal.addAll(l3);
        listFinal.addAll(l4);
        listFinal.addAll(l5);
        listFinal.addAll(l6);
        listFinal.addAll(l7);
        listFinal.addAll(l8);
        listFinal.addAll(l9);

        return listFinal.stream().toArray(String[]::new);
    }


}
