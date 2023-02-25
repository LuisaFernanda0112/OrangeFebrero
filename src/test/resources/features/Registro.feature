@Allpim

Feature: all pim
@Addemployee

Scenario Outline: add employee
	Given open the browser
	And  the user fill out user name <userName> and password <pass>
	when the user access to the add employee firts  <firstName> last name <lastName>
	Examples:

	|userName|pass|
	|Admin|admin123|Luisa|Hernandez|


