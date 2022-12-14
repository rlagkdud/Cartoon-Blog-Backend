package toonlog.toonlogspring.domain;

public class Frame { // static 이미지 저장하는 법 알아오기
    private String frame1;
    private String frame2;

    private String speechBubble1;
    private String speechBubble2;

    public String getFrame1() {
        return frame1;
    }

    public void setFrame1(String frame1) {
        this.frame1 = frame1;
    }

    public String getFrame2() {
        return frame2;
    }

    public void setFrame2(String frame2) {
        this.frame2 = frame2;
    }

    public String getSpeechBubble1() {
        return speechBubble1;
    }

    public void setSpeechBubble1(String speechBubble1) {
        this.speechBubble1 = speechBubble1;
    }

    public String getSpeechBubble2() {
        return speechBubble2;
    }

    public void setSpeechBubble2(String speechBubble2) {
        this.speechBubble2 = speechBubble2;
    }
}
