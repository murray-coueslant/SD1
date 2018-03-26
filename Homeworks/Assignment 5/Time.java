
public class Time {
    long milliseconds;
    int seconds, minutes, hours;
    public Time(){
        this.milliseconds = System.currentTimeMillis();
        this.seconds = (int)(milliseconds / 1000) % 60;
        this.minutes = (int)((milliseconds / (1000*60)) % 60);
        this.hours = (int)((milliseconds / (1000*60*60)) % 24);
    }

    public Time(long inMilliseconds){
        this.milliseconds = inMilliseconds;
        this.seconds = (int)(milliseconds / 1000) % 60;
        this.minutes = (int)((milliseconds / (1000*60)) % 60);
        this.hours = (int)((milliseconds / (1000*60*60)) % 24);
    }

    public int getHour(){
        return this.hours;
    }

    public int getMinute(){
        return this.minutes;
    }

    public int getSecond(){
        return this.seconds;
    }

    public void setTime(long elapseTime){
        this.milliseconds = elapseTime;
        this.seconds = (int)(this.milliseconds / 1000) % 60;
        this.minutes = (int)((this.milliseconds / (1000*60)) % 60);
        this.hours = (int)((this.milliseconds / (1000*60*60)) % 24);
    }
}