package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        MotherBoard motherBoard = null;
        Screen screen = null; 
        Case phoneCase = null;
        if (phoneType.equals("Android")) {
            MotherBoardFactory androidMotherBoardFactory = new AndroidMotherBoardFactory();
            ScreenFactory androidScreenFactory = new AndroidScreenFactory();
            CaseFactory androidCaseFactory = new AndroidCaseFactory();
            motherBoard = androidMotherBoardFactory.createPart();
            screen = androidScreenFactory.createPart();
            phoneCase = androidCaseFactory.createPart();
            
        } else if(phoneType.equals("Iphone")){
            MotherBoardFactory iphoneMotherBoardFactory = new IphoneMotherBoardFactory();
            ScreenFactory iphoneScreenFactory = new IphoneScreenFactory();
            CaseFactory iphoneCaseFactory = new IphoneCaseFactory();
            motherBoard = iphoneMotherBoardFactory.createPart();
            screen = iphoneScreenFactory.createPart();
            phoneCase = iphoneCaseFactory.createPart();
        }
        
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
