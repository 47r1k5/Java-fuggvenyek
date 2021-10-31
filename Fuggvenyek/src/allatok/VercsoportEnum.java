package allatok;

public enum VercsoportEnum {
    
    DEA1_1(350),DEA1_2(350),DEA1_3(350),DEA4(350),DEA6(350),DEA(350),DAL(350);
    
    private final Integer levetel;
    
    private VercsoportEnum(Integer levetel){
    this.levetel = levetel;
    }

    public Integer getLevetel(Boolean beteg) {
        if (beteg) {
            return this.levetel-100;
        }
        return this.levetel-20;
    }
    
    
    
}
