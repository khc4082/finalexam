package com.hyeonseong;

public class Main {

    public static void main(String[] args) {
     
            // 000000
            // 010000

            SimulatedAnnealing sa = new SimulatedAnnealing(1, 0.97, 100);
            sa.solve(new Problem() {
                @Override
                public double fit(double x) {
                    return 0.16*x*x*x*x -x*x + 0.37*x + 5;
                }

                @Override
                public boolean isNeighborBetter(double f0, double f1) {
                    return f1 > f0;
                }
            }, 0, 31);

            System.out.println(sa.hist);
            // x=19, f(x)=441
        }
    }
