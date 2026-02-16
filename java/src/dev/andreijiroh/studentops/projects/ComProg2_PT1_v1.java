package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 2 - 02 Performance Task
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
*/
class ComProg2_PT1_v1 {
  interface BudgetMath {
    public int getTotalAllowance();
    public void chopBudgetByCategories();
    public int getTotalSpend();
    public int getDiscreatoryFunds();
  }

  static class currentSemester implements BudgetMath {
    /**
     * Monthly allowance, rounded up to nearest peso for simplicity
     */
    int monthlyAllowance;
    /**
     * Transport costs
     */
    int trasnport;
    /**
     * Snacking (e.g. food and drinks on breaks and after PATHFIT 2 class on Tuesdays)
     */
    int snacks;
    /**
     * Student subscriptions (YouTube Premium, prepaid data plans)
     */
    int recurring_spend;
    /**
     * Emergency fund stash (also doubles as insurance premium payments for Singlife PH Plan and Protect)
     */
    int emergency_fund;

    /**
     * A class to show your monthly budget nicely
     * @param monthlyAllowance Monthly allowance from your parents, excluding tuition and scholarship funds from LGU and private entities.
     * @param transport Transport costs to and from school (hint: total daily costs x days in school x 4 weeks)
     * @param snacks Snacking (e.g. food and drinks on breaks and after PATHFIT 2 class on Tuesdays)
     * @param recurring_spend Recurrinng spend on a monthly basis (e.g. YouTube Premium student subscription [PHP 115 as of time of writing], prepaid data plans [Smart's MAGIC Data and GOMO No Expiry Data])
     * @param emergency_fund Emergency fund seeding, which also serves for insurance premium payments in the Singlife PH Plan and Protect app.
     */
    currentSemester(int monthlyAllowance, int transport, int snacks, int recurring_spend, int emergency_fund) {
      this.monthlyAllowance = monthlyAllowance;
      this.trasnport = transport;
      this.snacks = snacks;
      this.recurring_spend = recurring_spend;
      this.emergency_fund = emergency_fund;
    }

    public int getTotalAllowance() {
      return monthlyAllowance * 4;
    };

    public int getTotalSpend() {
      return trasnport + snacks + recurring_spend + emergency_fund;
    }

    public int getDiscreatoryFunds() {
      return monthlyAllowance - getTotalSpend();
    }

    public void chopBudgetByCategories() {
      System.out.println("===== MONTHLY BUDGET =====");
      System.out.println("Transport to and from school: " + trasnport);
      System.out.println("Food and Drinks for Snacks and Breaks: " + snacks);
      System.out.println("Recurring Spend (YTP student subscription, data plans): " + recurring_spend);
      System.out.println("Emergency Fund/Insurance Premiums: " + emergency_fund);
      System.out.println("Total spend: "+getTotalSpend());
    }
  }

  public static void main(String[] args) {
    currentSemester budget = new currentSemester(2500, 864, 350, 650, 300);
    System.out.println("Monthly allowance: "+budget.monthlyAllowance);
    System.out.println("Total allowance this semester: " + budget.getTotalAllowance() + " pesos");
    System.out.println("Remaining funds after planned budget: "+budget.getDiscreatoryFunds()+" pesos");
    System.out.println();
    budget.chopBudgetByCategories();
  }
}