class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        this.minutes += 1;
        if (this.minutes > 59) {
            if (this.hours < 12) {
                this.hours += 1;
            } else {
                this.hours = 1;
            }

            this.minutes = 0;
        }
    }
}