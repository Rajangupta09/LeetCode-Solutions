class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        boolean previousWasZero = true;
        boolean flowerIsPlanted = false;
        for (int i = 0  ; i < length; i++) {
            int flower = flowerbed[i];
            switch(flower) {
                case 0: 
                    if (previousWasZero) {
                        flowerIsPlanted = true;
                        previousWasZero = false;
                        n--;
                    } else {
                        previousWasZero = true;
                        flowerIsPlanted = false;
                    }
                    break;
                case 1:
                    previousWasZero = true;
                    if (flowerIsPlanted){
                        flowerIsPlanted = false;
                        n++;
                    }
                    i++;
                    break;
            }
        }
        if (n <= 0){
            return true;
        }
        return false;
    }
}