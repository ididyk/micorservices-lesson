package edu.cursor.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@AllArgsConstructor
public class DataFillerService {



    @PostConstruct
    @Transactional
    public void fillData(){

    //1	    cantushev0	    pragpYMqeHS	    llitchfield0@pbs.org	        913-521-3928
    //2	    bkrysiak1	    VMMNoe4y4vT	    jurry1@intel.com	            697-320-1260
    //3	    evaillant2	    IdYpTSna	    uattwater2@theglobeandmail.com	950-782-1020
    //4	    aadlem3	        96notxYUiJxf	cmcleary3@globo.com	            548-658-5534
    //5	    fheakins4	    2O0Upf	        alonghorne4@nifty.com	        834-174-9273
    //6	    jsmallacombe5	uS3AQgCLEJ8	    bgladhill5@ibm.com	            457-611-5968
    //7	    tkarlicek6	    Yuan2CV1	    bdixcey6@miitbeian.gov.cn	    389-519-1463
    //8	    twigzell7	    KYL9WH1MLI9	    dkeld7@mozilla.org	            311-150-2150
    //9	    rthorius8	    HG1DfRXI	    gtripney8@time.com	            747-818-5998
    //10	wpeachey9	    CYLFJCZvIdvg	jrudolf9@lycos.com	            626-301-8492



    }
}
