/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author ESTUDIANTES
 */
public class libreria {

    public int[] llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }
        return vector;
    }

    public int[][] llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        return matriz;
    }

    public void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
        }
        System.out.println();
    }

    public void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public float Vectorpromedio(int[] vector) {
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return (float) suma / vector.length;
    }

    public float Matrizpromedio(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                suma += num;
                contador++;
            }
        }
        return (float) suma / contador;
    }

    public int Mayorvector(int[] vector) {
        int mayor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public int Mayormatriz(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num > mayor) {
                    mayor = num;
                }
            }
        }
        return mayor;
    }

    public int sumavector(int[] vector) {
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return suma;
    }

    public int sumamatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }
   }

