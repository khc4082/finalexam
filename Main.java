package com.hyeonseong;

public class Main {

    public static void main(String[] args) {

            // 000000
            // 010000

            SimulatedAnnealing sa = new SimulatedAnnealing(1, 0.97, 100);
            sa.solve(new Problem() {
                @Override
                public double fit(double x) {
                    return x*x*x; // or x*x*x*x // 함수 대입
                }

                @Override
                public boolean isNeighborBetter(double f0, double f1) {
                    return f1 > f0;
                }
            }, 1, 10);  // x값 범위 설정

            System.out.println(sa.hist);

        }
    }


