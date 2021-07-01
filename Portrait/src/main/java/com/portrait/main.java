package com.portrait;

import com.portrait.Service.AcdemicContributionService;
import com.portrait.Service.ResService;
import com.portrait.Service.StandardService;

public class main {

    public static void main(String[] args) throws Exception{
//        AcdemicContributionService acdemicContributionService = new AcdemicContributionService() ;
//        acdemicContributionService.AddAcdemicContribution();
//        ResService resService = new ResService() ;
//        resService.addResService();
//        resService.addPatentService();
        StandardService standardService = new StandardService() ;
        standardService.addStandard();
    }
}
