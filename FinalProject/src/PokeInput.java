
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class PokeInput {
	String commandlist;
	public PokeInput(String commandlist){
		ArrayList<Pokemon> boomerang = new ArrayList<Pokemon>();
			String [] goodInput = {"List", "Brock", "Misty", "Surge", "Erica", "Sabrina", "Koga", "Blaine", "Giovanni", "Blue", "Red"};
				Scanner scan = new Scanner(commandlist);
				String answers = null;
				commandFix:
				while(scan.hasNext()){
					answers = scan.next();
					
					for(int i = 0; i < goodInput.length; i++){
						if(answers.equals(goodInput[i])){   
							break commandFix;
						}
						
					}
				}
				System.out.println(answers);
				if(answers == null){
					answers = "Billybob";
				}
				if(answers.equals("list")){
					System.out.println("I want to beat Brock");
					System.out.println("I want to beat Misty");
					System.out.println("I want to beat Lt. Surge");
					System.out.println("I want to beat Erica");
					System.out.println("I want to beat Sabrina");
					System.out.println("I want to beat Koga");
					System.out.println("I want to beat Blaine");
					System.out.println("I want to beat Giovanni");
					System.out.println("I want to beat Blue");
					System.out.println("I want to beat Red");
					System.out.println("I want a team that is strong");
				}
				
				else if(answers.equals("Brock")){
					boomerang = Brock();
					System.out.println(boomerang);
						} else if(answers.equals("Misty")) {
					
						boomerang = Misty();
						System.out.println(boomerang);
							} else if(answers.equals("Surge")) {
						
							boomerang = Surge();
							System.out.println(boomerang);
								}else if(answers.equals("Erica")) {
							
								boomerang = Erica();
								System.out.println(boomerang);
									}else if (answers.equals("Sabrina")){
								
									boomerang = Sabrina();
									System.out.println(boomerang);
										}else if (answers.equals("Koga")) {
									
										boomerang = Koga();
										System.out.println(boomerang);
											}else if (answers.equals("Blaine")) {
										
											boomerang = Blaine();
											System.out.println(boomerang);
												}else if (answers.equals("Giovanni")) {
											
												boomerang = Giovanni();
												System.out.println(boomerang);
													}else if (answers.equals("Blue")){
												
													boomerang = Blue();
													System.out.println(boomerang);
														}else if (answers.equals("Red")){
													
														boomerang = Red();
														System.out.println(boomerang);
															}else {
																System.out.println("Enter a real command please");
																
							}
				scan.close();
				}
	//I want to beat Brock!
	public static ArrayList<Pokemon> Brock(){
		//Make second array list 
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for(int i = 0; i < PokeMain.Pkmn.size(); i++){
			if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
				pokedex.add(PokeMain.Pkmn.get(i));
				}
			}
			Random rand = new Random();
			System.out.println("Pokedex size " + pokedex.size());
			for(int i = 0; i < 6; i++){
				roster.add(pokedex.get(rand.nextInt(pokedex.size())));
			}
			return roster; 
	}
	
		//I want to beat Misty!
				public static ArrayList<Pokemon> Misty(){
					//Make second array list 
					ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
					ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
					for(int i = 0; i < PokeMain.Pkmn.size(); i++){
						if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
							pokedex.add(PokeMain.Pkmn.get(i));
							}
						}
						Random rand = new Random();
						for(int j = 0; j < 6; j++){
							roster.add(pokedex.get(rand.nextInt(pokedex.size())));
						}
						return roster;
				}
				
		//I want to beat Lt. Surge!
							public static ArrayList<Pokemon> Surge(){
								//Make second array list 
								ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
								ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
								for(int i = 0; i < PokeMain.Pkmn.size(); i++){
									if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
										pokedex.add(PokeMain.Pkmn.get(i));
										}
									}
									Random rand = new Random();
									for(int i = 0; i < 6; i++){
										roster.add(pokedex.get(rand.nextInt(pokedex.size())));
									}
									return roster;			
								}		
							
		//I want to beat Erica!
										public static ArrayList<Pokemon> Erica(){
											//Make second array list 
											ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
											ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
											for(int i = 0; i < PokeMain.Pkmn.size(); i++){
												if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
													pokedex.add(PokeMain.Pkmn.get(i));
													}
												}
												Random rand = new Random();
												for(int i = 0; i < 6; i++){
													roster.add(pokedex.get(rand.nextInt(pokedex.size())));
												}
												return roster;
										}
										
		//I want to beat Sabrina!
													public static ArrayList<Pokemon> Sabrina(){
														//Make second array list 
														ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
														ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
														for(int i = 0; i < PokeMain.Pkmn.size(); i++){
															if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
																pokedex.add(PokeMain.Pkmn.get(i));
																}
															}
															Random rand = new Random();
															for(int i = 0; i < 6; i++){
																roster.add(pokedex.get(rand.nextInt(pokedex.size())));
															}
															return roster;
													}
													
		//I want to beat Koga!
																public static ArrayList<Pokemon> Koga(){
																	//Make second array list 
																	ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
																	ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
																	for(int i = 0; i < PokeMain.Pkmn.size(); i++){
																		if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
																			pokedex.add(PokeMain.Pkmn.get(i));
																			}
																		}
																		Random rand = new Random();
																		for(int i = 0; i < 6; i++){
																			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
																		}
																		return roster;
																}
																
		//I want to beat Blaine!
																			public static ArrayList<Pokemon> Blaine(){
																				//Make second array list 
																				ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
																				ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
																				for(int i = 0; i < PokeMain.Pkmn.size(); i++){
																					if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
																						pokedex.add(PokeMain.Pkmn.get(i));
																						}
																					}
																					Random rand = new Random();
																					for(int i = 0; i < 6; i++){
																						roster.add(pokedex.get(rand.nextInt(pokedex.size())));
																					}
																					return roster;
																			}
																			
		//I want to beat Giovanni!
																						public static ArrayList<Pokemon> Giovanni(){
																							//Make second array list 
																							ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
																							ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
																							for(int i = 0; i < PokeMain.Pkmn.size(); i++){
																								if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
																									pokedex.add(PokeMain.Pkmn.get(i));
																									}
																								}
																								Random rand = new Random();
																								for(int i = 0; i < 6; i++){
																									roster.add(pokedex.get(rand.nextInt(pokedex.size())));
																								}
																								return roster;
																						}
		//I want to beat Blue!  
																									public static ArrayList<Pokemon> Blue(){
																										//Make second array list 
																										ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
																										ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
																										for(int i = 0; i < PokeMain.Pkmn.size(); i++){
																											if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
																												pokedex.add(PokeMain.Pkmn.get(i));
																												}
																											}
																											Random rand = new Random();
																											for(int i = 0; i < 6; i++){
																												roster.add(pokedex.get(rand.nextInt(pokedex.size())));
																											}
																											return roster;
																									}
																									
		//I want to beat Red! 
																												public static ArrayList<Pokemon> Red(){
																													//Make second array list 
																													ArrayList<Pokemon> roster = new ArrayList<Pokemon>(); 
																													ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
																													for(int i = 0; i < PokeMain.Pkmn.size(); i++){
																														if(PokeMain.Pkmn.get(i).getType().equals("Grass")||PokeMain.Pkmn.get(i).getType().equals("Water")||PokeMain.Pkmn.get(i).getType().equals("Fighting")){
																															pokedex.add(PokeMain.Pkmn.get(i));
																															}
																														}
																														Random rand = new Random();
																														for(int i = 0; i < 6; i++){
																															roster.add(pokedex.get(rand.nextInt(pokedex.size())));
																														}
																														return roster;
																														
																										
		
	}
	
}
