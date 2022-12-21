@smoke
Feature:Full view price
  Scenario: Verify in full view pricing screen under product price section user can view at least 8 products to view product values
    Given Login to OneFps as Pricing Manager or Super User
    Then User should able to login to the system successfully.
    When Navigate to pricing -Fullview Pricing -select the site
    Then User should be navigating to Quickview Pricing Scfreen successfully
    When Select cluser/ Site
    Then Cluster / Site should be selected
    When Check in Full view Pricing screen under product price section
    Then User should be able to see at least 8 products under product price section in full view pricing screen without using horizontal scroll bar




