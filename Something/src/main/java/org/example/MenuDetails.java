package org.example;

public class MenuDetails {
    private String key;
    private String menuTitle;
    private String iconLocation;
    private String helpText;
    private Boolean isVisible;

    public MenuDetails(String key, String menuTitle, String iconLocation, String helpText, Boolean isVisible) {
        this.key = key;
        this.menuTitle = menuTitle;
        this.iconLocation = iconLocation;
        this.helpText = helpText;
        this.isVisible = isVisible;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getIconLocation() {
        return iconLocation;
    }

    public void setIconLocation(String iconLocation) {
        this.iconLocation = iconLocation;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    @Override
    public String toString() {
        return "MenuDetails{" +
                "key='" + key + '\'' +
                ", menuTitle='" + menuTitle + '\'' +
                ", iconLocation='" + iconLocation + '\'' +
                ", helpText='" + helpText + '\'' +
                ", isVisible=" + isVisible +
                '}';
    }
}
