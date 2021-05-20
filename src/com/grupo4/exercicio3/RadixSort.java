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
        int tamanho = retornaMaiorTamanho(iArr);
        sArr = addPaddingZero(sArr, tamanho);
        for(int i = tamanho; i > 0; i--) {
            sArr = ordenarListaPorPosicao(sArr, i-1);
        }

        return converteArray(sArr);
    }

    private static String[] fromIntArrayToStingArray(int[] iArr){
        String sArr[] = new String[iArr.length];

        for(int i = 0;  i < iArr.length ; i++){
           sArr[i] = iArr[i]+"";
        }

        return sArr;
    }


    private static int[] converteArray(String[] sArr){
        int iArr[] = new int[sArr.length];
        for (int i=0; i<sArr.length; i++){
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        return iArr;
    }

    private static int retornaMaiorTamanho(int[] iArr){
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

    private static String[] ordenarListaPorPosicao(String[] sArr, int posicao){
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
            char ultimoDigito = sArr[i].charAt(posicao);

            if(ultimoDigito == '0'){
                l0.add(sArr[i]);
            }else if(ultimoDigito == '1'){
                l1.add(sArr[i]);
            }else if(ultimoDigito == '2'){
                l2.add(sArr[i]);
            }else if(ultimoDigito == '3'){
                l3.add(sArr[i]);
            }else if(ultimoDigito == '4'){
                l4.add(sArr[i]);
            }else if(ultimoDigito == '5'){
                l5.add(sArr[i]);
            }else if(ultimoDigito == '6'){
                l6.add(sArr[i]);
            }else if(ultimoDigito == '7'){
                l7.add(sArr[i]);
            }else if(ultimoDigito == '8'){
                l8.add(sArr[i]);
            }else if(ultimoDigito == '9'){
                l9.add(sArr[i]);
            }
        }

        List<String> listaFinal = new ArrayList<>();
        listaFinal.addAll(l0);
        listaFinal.addAll(l1);
        listaFinal.addAll(l2);
        listaFinal.addAll(l3);
        listaFinal.addAll(l4);
        listaFinal.addAll(l5);
        listaFinal.addAll(l6);
        listaFinal.addAll(l7);
        listaFinal.addAll(l8);
        listaFinal.addAll(l9);

        return listaFinal.stream().toArray(String[]::new);
    }


    }
