package Chapter7;


class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = !power; }
    void play() {
        System.out.println("VCR PLAY");
    }
    void stop() {
        System.out.println("VCR STOP");
    }
    void rew() {
        System.out.println("VCR REW");
    }
    void ff() {
        System.out.println("VCR FF");
    }
}

class TVCR extends Tv {
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}
