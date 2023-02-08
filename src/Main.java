import java.util.*;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {

        Company akamai = new Company("Akamai");

        Map<String, String> holidaysForAkamai = new HashMap<>();
        holidaysForAkamai.put("New Year's Day", "1 January");
        holidaysForAkamai.put("Independence Day", "4 July");
        holidaysForAkamai.put("Employee Appreciation Day", "3 March");
        holidaysForAkamai.put("Confederate Memorial Day", "24 April");
        holidaysForAkamai.put("National Workaholics Day", "5 July");
        holidaysForAkamai.put("Car Free Day", "22 September");

        Company bainCapital = new Company("BainCapital");

        Map<String, String> holidaysForBainCapital = new HashMap<>();
        holidaysForBainCapital.put("New Year's Day", "1 January");
        holidaysForBainCapital.put("Christmas", "25 December");
        holidaysForBainCapital.put("Thanksgiving Day", "24 November");
        holidaysForBainCapital.put("Boss's Day", "16 October");
        holidaysForBainCapital.put("National Pizza Day", "9 February");

        Company cityGardenWaldorfSchool = new Company("City garden waldorf school");
        Company iTConsortium = new Company("I.T. Consortium");
        Company nvidia = new Company("Nvidia");


        Worker firstPerson = new Worker("Sam", 65, 198, 118, 748.89, 355.77);

        List<Person> firstPersonChildren = new ArrayList<>();
        Worker firstChildOfFirstPerson = new Worker("William");
        Worker secondChildOfFirstPerson = new Worker("Ava");
        Worker thirdChildOfFirstPerson = new Worker("Olivia");

        firstPersonChildren.add(firstChildOfFirstPerson);
        firstPersonChildren.add(secondChildOfFirstPerson);
        firstPersonChildren.add(thirdChildOfFirstPerson);

        firstPerson.setChildren(firstPersonChildren);

        firstPerson.infoAboutChildren();

        List<Company>workedFirstPerson = new ArrayList<>();
        workedFirstPerson.add(akamai);
        workedFirstPerson.add(nvidia);
        workedFirstPerson.add(bainCapital);;

        firstPerson.setCompanies(workedFirstPerson);

        firstPerson.workedOut();

        Set<SuperannuationFund> firstPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForFirstPerson = new SuperannuationFund("Pupkin and Ko", TypeOfFund.SWINDLE, DateGeneration.generateOfDate(firstPerson.getAge()));
        SuperannuationFund secondFundForFirstPerson = new SuperannuationFund("State Fund", TypeOfFund.NATIONAL, firstFundForFirstPerson.getDateCreated());
        SuperannuationFund thirdFundForFirstPerson = new SuperannuationFund("Keep money", TypeOfFund.NON_NATIONAL, firstFundForFirstPerson.getDateCreated());

        firstPersonsFund.add(firstFundForFirstPerson);
        firstPersonsFund.add(secondFundForFirstPerson);
        firstPersonsFund.add(thirdFundForFirstPerson);

        firstPerson.setFunds(firstPersonsFund);

        double pensionOfFirstPerson = firstPerson.calculatePension(19, 65);
        System.out.println("The best pension of " + firstPerson.getName() + " is " + pensionOfFirstPerson);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker secondPerson = new Worker("Jessica", 25, 165, 52, 4556.99, 5500);

        List<Person> secondPersonChildren = new ArrayList<>();
        Worker firstChildOfSecondPerson = new Worker("Benjamin");
        Worker secondChildOfSecondPerson = new Worker("Evelyn");
        Worker thirdChildOfSecondPerson = new Worker("Christopher");
        Worker fourthChildOfSecondPerson = new Worker("Fourth");

        secondPersonChildren.add(firstChildOfSecondPerson);
        secondPersonChildren.add(secondChildOfSecondPerson);
        secondPersonChildren.add(thirdChildOfSecondPerson);
        secondPersonChildren.add(fourthChildOfSecondPerson);

        secondPerson.setChildren(secondPersonChildren);

        secondPerson.infoAboutChildren();

        List<Company>workedSecondPerson = new ArrayList<>();
        workedSecondPerson.add(cityGardenWaldorfSchool);
        workedFirstPerson.add(iTConsortium);

        secondPerson.setCompanies(workedSecondPerson);

        secondPerson.workedOut();

        Set<SuperannuationFund> secondPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForSecondPerson = new SuperannuationFund("States Fund", TypeOfFund.NATIONAL, DateGeneration.generateOfDate(secondPerson.getAge()));
        SuperannuationFund secondFundForSecondPerson = new SuperannuationFund("Your Money", TypeOfFund.SWINDLE, firstFundForSecondPerson.getDateCreated());
        SuperannuationFund thirdFundForSecondPerson = new SuperannuationFund("Pencorp", TypeOfFund.NON_NATIONAL, firstFundForSecondPerson.getDateCreated());

        secondPersonsFund.add(firstFundForSecondPerson);
        secondPersonsFund.add(secondFundForSecondPerson);
        secondPersonsFund.add(thirdFundForSecondPerson);

        secondPerson.setFunds(secondPersonsFund);

        double secondPersonsPension = secondPerson.calculatePension(18, 60);

        System.out.println("The best pension of " + secondPerson.getName() + " is " + secondPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker thirdPerson = new Worker("Jenifer", 0, 49, 4, 0, 0);

        List<Person> thirdPersonChildren = new ArrayList<>();

        thirdPerson.setChildren(thirdPersonChildren);

        thirdPerson.infoAboutChildren();

        List<Company>workedThirdPerson = new ArrayList<>();

        thirdPerson.setCompanies(workedThirdPerson);

        thirdPerson.workedOut();

        Set<SuperannuationFund> thirdPersonsFund = new HashSet<SuperannuationFund>();
        SuperannuationFund firstFundForThirdPerson = new SuperannuationFund("No fund", TypeOfFund.SWINDLE, "Fund hasn't created");

        thirdPersonsFund.add(firstFundForThirdPerson);

        thirdPerson.setFunds(thirdPersonsFund);

        double thirdPersonsPension = thirdPerson.calculatePension(18, 65);

        System.out.println("The best pension  of " + thirdPerson.getName() + " is " + thirdPersonsPension);


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner fourthPerson = new Pensioner("Laura", 57, 172, 61, 5481.24);
        List<Person> fourthPersonChildren = new ArrayList<>();
        Worker firstChildOfFourthPerson = new Worker("Elijah");
        Worker secondChildOfFourthPerson = new Worker("Ellen");
        Worker thirdChildOfFourthPerson = new Worker("Elliott");
        Worker fourthChildOfFourthPerson = new Worker("Katherine");

        fourthPersonChildren.add(firstChildOfFourthPerson);
        fourthPersonChildren.add(secondChildOfFourthPerson);
        fourthPersonChildren.add(thirdChildOfFourthPerson);
        fourthPersonChildren.add(fourthChildOfFourthPerson);

        fourthPerson.setChildren(fourthPersonChildren);

        fourthPerson.infoAboutChildren();

        fourthPerson.die(43);


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner fifthPerson = new Pensioner("Bruce", 71, 187, 71, 1965.75);
        List<Person> fifthPersonChildren = new ArrayList<>();
        Worker firstChildOfFifthPerson = new Worker("John");
        Worker secondChildOfFifthPerson = new Worker("Arnold");
        Worker thirdChildOfFifthPerson = new Worker("Jason");

        fifthPersonChildren.add(firstChildOfFifthPerson);
        fifthPersonChildren.add(secondChildOfFifthPerson);
        fifthPersonChildren.add(thirdChildOfFifthPerson);

        fifthPerson.setChildren(fifthPersonChildren);

        fifthPerson.infoAboutChildren();

        fifthPerson.die(65);


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner sixthPerson = new Pensioner("Alisa", 101, 158, 51, 2361.73);

        List<Person> sixthPersonChildren = new ArrayList<>();
        Worker firstChildOfSixthPerson = new Worker("Noah");
        Worker secondChildOfSixthPerson = new Worker("Mia");
        Worker thirdChildOfSixthPerson = new Worker("Jesse");
        Worker fourthChildOfSixPerson = new Worker("Gabriel");

        sixthPersonChildren.add(firstChildOfSixthPerson);
        sixthPersonChildren.add(secondChildOfSixthPerson);
        sixthPersonChildren.add(thirdChildOfSixthPerson);
        sixthPersonChildren.add(fourthChildOfSixPerson);

        sixthPerson.setChildren(sixthPersonChildren);

        sixthPerson.infoAboutChildren();

        sixthPerson.die(60);
    }
}