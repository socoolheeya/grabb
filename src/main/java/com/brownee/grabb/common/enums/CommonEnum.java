package com.brownee.grabb.common.enums;

public class CommonEnum {
    public enum PricingPlan {
        FREE, STANDARD, PREMIUM, ENTERPRISE
    }
    public enum WorkSpaceType {
        PRIVATE, PUBLIC
    }

    public enum BoardVisibility {
        WORKSPACE, PRIVATE, PUBLIC
    }
    public enum BoardStatus {
        OPEN, CLOSE
    }
    public enum CardType {
        TODO, DOING, DONE
    }
    public enum CheckListItemStatus {
        TODO, DONE
    }
    public enum CoverSize {
        PARTIAL, ALL
    }
    public enum CoverBrightness {
        DARK, LIGHT
    }
}
