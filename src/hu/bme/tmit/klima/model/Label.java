package hu.bme.tmit.klima.model;

import com.google.common.collect.ImmutableBiMap;

public class Label {
	private final ImmutableBiMap<String, Integer> dictionary;

	public Label() {
		dictionary = new ImmutableBiMap.Builder<String, Integer>()
				.put("esetsorszáma", 1)
				.put("teljes_sorrend", 2)
				.put("eredeti_sorrend", 3)
				.put("Közútszáma", 4)
				.put("kilométer", 5)
				.put("méter", 6)
				.put("ÉV", 7)
				.put("hónap", 8)
				.put("nap", 9)
				.put("óra", 10)
				.put("beépítés", 11)
				.put("Település", 12)
				.put("útalakzat", 13)
				.put("természet", 14)
				.put("kimenetel", 15)
				.put("típus", 16)
				.put("@2002előttitípus", 17)
				.put("Megnevezés", 18)
				.put("TELEPKOD", 19)
				.put("TELEPNEV", 20)
				.put("ÉVHÓ", 21)
				.put("NAPÓRA", 22)
				.put("ÉVHÓNAPNAP", 23)
				.put("HÓNAPNAPÓRA", 24)
				.put("ÉVHÓNAPNAPÓRA", 25)
				.put("NAPHAVISORSZÁMA", 26)
				.put("NAPRÖVIDÍTETTNEVE", 27)
				.put("ANAPÉVISORSZÁMA", 28)
				.put("ÉVHÓNANÉV", 29)
				.put("HÓNAPNAPKÓD", 30)
				.put("NAPKÓD", 31)
				.put("NAPNÉV", 32)
				.put("ANAPJELLEGENÉV", 33)
				.put("ANAPJELLEGEKÓD", 34)
				.put("NAPNEVEésJELLEGEKOMBINÁLTKÓD", 35)
				.put("NAPNEVEésJELLEGEKOMBINÁLTNÉV", 36)
				.put("Téliidőszámítás1h", 37)
				.put("Nyáriidőszámítás2h", 38)
				.put("IdőszámításTélivagynyári", 39)
				.put("Helységmegnevezése2011január1", 40)
				.put("TELEPÜLÉSNEVE", 41)
				.put("AREA", 42)
				.put("ORIG_FID", 43)
				.put("EOV_X", 44)
				.put("EOV_Y", 45)
				.put("WGS1", 46)
				.put("WGS2", 47)
				.put("Helységjogállása2011január1Kód", 48)
				.put("Helységjogállása2011január1NÉV", 49)
				.put("RÉGIÓKÓD", 50)
				.put("RÉGIÓNÉV", 51)
				.put("MEGYEKOD", 52)
				.put("MegyeNEV2011január1", 53)
				.put("KISTERKOD", 54)
				.put("KISTERKOD2Újkistérség2004", 55)
				.put("KISTERKOD3Kistérség2007", 56)
				.put("KISTERKÓD2011január1", 57)
				.put("KISTERNÉV2011január1", 58)
				.put("KISTERszékhelye2011január1", 59)
				.put("Településikoordinátákéskatböv_Járáskód", 60)
				.put("Településikoordinátákéskatböv_Járásszékhely1", 61)
				.put("Településikoordinátákéskatböv_JARASNEV", 62)
				.put("JARASKOZPONT", 63)
				.put("JárásközpontTAZON", 64)
				.put("Körjegyzőségkódja2011január1", 65)
				.put("Körjegyzőségszékhelye2011január1", 66)
				.put("Területhektár2011január1", 67)
				.put("Lakónépesség2011január1", 68)
				.put("Lakásokszáma2011január1", 69)
				.put("NEP20120101", 70)
				.put("NO20120101", 71)
				.put("FFI20120101", 72)
				.put("Agglomerációkódja", 73)
				.put("AGGL12_KOD", 74)
				.put("AGGL3_KOD", 75)
				.put("MT99AzagglomerációtípusátazonosítópozícióT9920030801", 76)
				.put("MT100AzagglomerációT10020030801től", 77)
				.put("MT101Azagglomerációnbelülibesorolás", 78)
				.put("MT40KÖRJEGYZŐSÉGKÓDJA", 79)
				.put("MT41KÖRJEGYZŐSÉGSZÉKHELYÉNEKKÓDJAMT41B", 80)
				.put("Mezőgazdaságitájkörzetkódja", 81)
				.put("Borvidékkódja", 82).put("Idegenforgalmirégiókódja", 83)
				.put("Üdülőkörzetikód", 84).put("Név", 85)
				.put("TAZON2010BPKER", 86).put("TAZON2007BPKER", 87)
				.put("TAZON20032004BPKER", 88).put("TAZON1984BPKER", 89)
				.put("TAZON2002BPKER", 90).put("TAZON2006BPKER", 91)
				.put("TAZON200705BPKER", 92).put("TAZON2007BPKERB", 93)
				.put("TAZON2010BPÖSSZ", 94).put("TAZON2007BPÖSSZ", 95)
				.put("TAZON20032004BPÖSSZ", 96).put("TAZON1984BPÖSSZ", 97)
				.put("TAZON2002BPÖSSZ", 98).put("TAZON2006BPÖSSZ", 99)
				.put("TAZON200705BPÖSSZ", 100).put("TAZON2007BPÖSSZ_A", 101)
				.put("MT03MegyeBPÖSSZ", 102).put("JARASKOZPONTTAZON", 103)
				.put("JARASKOZPONTNEVE", 104)
				.put("Járásközpontokgeokódjai_Járáskód", 105)
				.put("Járásközpontokgeokódjai_Járásszékhely1", 106)
				.put("Járásközpontokgeokódjai_JARASNEV", 107)
				.put("JKAREA", 108).put("JKORIG_FID", 109).put("JKEOV_X", 110)
				.put("JKEOV_Y", 111).put("JKWGS1", 112).put("JKWGS2", 113)
				.put("TÉLINYÁRI", 114).put("TÉLINAPSZAK", 115)
				.put("NYÁRINAPSZAK", 116).put("NAPSZAK", 117)
				.put("BALESETSZÁMA", 118).put("ÉVMET", 119)
				.put("HÓNAPMET", 120).put("NAPMET", 121).put("ÓRAMET", 122)
				.put("JÉVHÓNAPNAPÓRAMET", 123).put("BALESETEKSZÁMA", 124)
				.put("HALÁLOSBALESET", 125).put("SÚLYOSBALESET", 126)
				.put("KÖNNYŰBALESET", 127).put("lakottterületen", 128)
				.put("lakottterületenkívül", 129).put("egyenesútvonal", 130)
				.put("útkanyarulat", 131).put("útkanyarulatok", 132)
				.put("bukkanó", 133).put("útkereszteződés", 134)
				.put("egyébútszakasz", 135).put("szembehaladójárművek", 136)
				.put("azonosiránybahaladójárművek", 137)
				.put("keresztezőjárművek", 138)
				.put("vasútiésközútijárműütközése", 139)
				.put("egyenesenhaladóéskanyarodójárművekütközése", 140)
				.put("állójárműnekütközés", 141)
				.put("szilárdtárgynakütközésútpályán", 142)
				.put("megcsúszásfarolásfelborulásútpályán", 143)
				.put("pályaelhagyásszilárdtárgynakütközésnélkül", 144)
				.put("pályaelhagyásszilárdtárgynakütközésútpályánkívül", 145)
				.put("gyalogoselütése", 146).put("utasokbalesete", 147)
				.put("ütközésvadonélőállattal", 148)
				.put("ütközésháziállattal", 149)
				.put("egyébtermészetűbaleset", 150).put("EBPhőmérséklet", 151)
				.put("EBPszinoptikusszélirány", 152)
				.put("EBPszinoptikusszélsebesség", 153)
				.put("EBPműszerszintilégnyomás", 154)
				.put("EBPrelatívnedvesség", 155).put("EBPösszfelhőzet", 156)
				.put("EBPcsapadékösszeg", 157)
				.put("EBPjellemzőcsapadékalakkód", 158)
				.put("EBPcsapadékösszegvonatkozásiideje", 159)
				.put("KBPhőmérséklet", 160).put("KBPszinoptikusszélirány", 161)
				.put("KBPszinoptikusszélsebesség", 162)
				.put("KBPműszerszintilégnyomás", 163)
				.put("KBPrelatívnedvesség", 164).put("KBPösszfelhőzet", 165)
				.put("KBPcsapadékösszeg", 166)
				.put("KBPjellemzőcsapadékalakkód", 167)
				.put("KBPcsapadékösKBPvonatkozásiideje", 168)
				.put("KBPhőmérsékletÓRÁNKÉNTIVÁLTOZÁS", 169)
				.put("KBPszinoptikusszélirányÓRÁNKÉNTIVÁLTOZÁS", 170)
				.put("KBPszinoptikusszélsebességÓRÁNKÉNTIVÁLTOZÁS", 171)
				.put("KBPműszerszintilégnyomásÓRÁNKÉNTIVÁLTOZÁS", 172)
				.put("KBPrelatívnedvességÓRÁNKÉNTIVÁLTOZÁS", 173)
				.put("EDEBhőmérséklet", 174)
				.put("EDEBszinoptikusszélirány", 175)
				.put("EDEBszinoptikusszélsebesség", 176)
				.put("EDEBműszerszintilégnyomás", 177)
				.put("EDEBrelatívnedvesség", 178).put("EDEBösszfelhőzet", 179)
				.put("EDEBcsapadékösszeg", 180)
				.put("EDEBjellemzőcsapadékalakkód", 181)
				.put("EDEBcsapadékösszegvonatkozásiideje", 182)
				.put("KDEBhőmérséklet", 183)
				.put("KDEBszinoptikusszélirány", 184)
				.put("KDEBszinoptikusszélsebesség", 185)
				.put("KDEBműszerszintilégnyomás", 186)
				.put("KDEBrelatívnedvesség", 187).put("KDEBösszfelhőzet", 188)
				.put("KDEBcsapadékösszeg", 189)
				.put("KDEBjellemzőcsapadékalakkód", 190)
				.put("KDEBcsapadékösKDEBvonatkozásiideje", 191)
				.put("KDEBhőmérsékletÓRÁNKÉNTIVÁLTOZÁS", 192)
				.put("KDEBszinoptikusszélirányÓRÁNKÉNTIVÁLTOZÁS", 193)
				.put("KDEBszinoptikusszélsebességÓRÁNKÉNTIVÁLTOZÁS", 194)
				.put("KDEBműszerszintilégnyomásÓRÁNKÉNTIVÁLTOZÁS", 195)
				.put("KDEBrelatívnedvességÓRÁNKÉNTIVÁLTOZÁS", 196)
				.put("EPÉCShőmérséklet", 197)
				.put("EPÉCSszinoptikusszélirány", 198)
				.put("EPÉCSszinoptikusszélsebesség", 199)
				.put("EPÉCSműszerszintilégnyomás", 200)
				.put("EPÉCSrelatívnedvesség", 201)
				.put("EPÉCSösszfelhőzet", 202).put("EPÉCScsapadékösszeg", 203)
				.put("EPÉCSjellemzőcsapadékalakkód", 204)
				.put("EPÉCScsapadékösszegvonatkozásiideje", 205)
				.put("KPÉCShőmérséklet", 206)
				.put("KPÉCSszinoptikusszélirány", 207)
				.put("KPÉCSszinoptikusszélsebesség", 208)
				.put("KPÉCSműszerszintilégnyomás", 209)
				.put("KPÉCSrelatívnedvesség", 210)
				.put("KPÉCSösszfelhőzet", 211).put("KPÉCScsapadékösszeg", 212)
				.put("KPÉCSjellemzőcsapadékalakkód", 213)
				.put("KPÉCScsapadékösKPÉCSvonatkozásiideje", 214)
				.put("KPÉCShőmérsékletÓRÁNKÉNTIVÁLTOZÁS", 215)
				.put("KPÉCSszinoptikusszélirányÓRÁNKÉNTIVÁLTOZÁS", 216)
				.put("KPÉCSszinoptikusszélsebességÓRÁNKÉNTIVÁLTOZÁS", 217)
				.put("KPÉCSműszerszintilégnyomásÓRÁNKÉNTIVÁLTOZÁS", 218)
				.put("KPÉCSrelatívnedvességÓRÁNKÉNTIVÁLTOZÁS", 219)
				.put("ESZEGEDhőmérséklet", 220)
				.put("ESZEGEDszinoptikusszélirány", 221)
				.put("ESZEGEDszinoptikusszélsebesség", 222)
				.put("ESZEGEDműszerszintilégnyomás", 223)
				.put("ESZEGEDrelatívnedvesség", 224)
				.put("ESZEGEDösszfelhőzet", 225)
				.put("ESZEGEDcsapadékösszeg", 226)
				.put("ESZEGEDjellemzőcsapadékalakkód", 227)
				.put("ESZEGEDcsapadékösszegvonatkozásiideje", 228)
				.put("KSZEGEDhőmérséklet", 229)
				.put("KSZEGEDszinoptikusszélirány", 230)
				.put("KSZEGEDszinoptikusszélsebesség", 231)
				.put("KSZEGEDműszerszintilégnyomás", 232)
				.put("KSZEGEDrelatívnedvesség", 233)
				.put("KSZEGEDösszfelhőzet", 234)
				.put("KSZEGEDcsapadékösszeg", 235)
				.put("KSZEGEDjellemzőcsapadékalakkód", 236)
				.put("KSZEGEDcsapadékösKSZEGEDvonatkozásiideje", 237)
				.put("KSZEGEDhőmérsékletÓRÁNKÉNTIVÁLTOZÁS", 238)
				.put("KSZEGEDszinoptikusszélirányÓRÁNKÉNTIVÁLTOZÁS", 239)
				.put("KSZEGEDszinoptikusszélsebességÓRÁNKÉNTIVÁLTOZÁS", 240)
				.put("KSZEGEDműszerszintilégnyomásÓRÁNKÉNTIVÁLTOZÁS", 241)
				.put("KSZEGEDrelatívnedvességÓRÁNKÉNTIVÁLTOZÁS", 242)
				.put("ESZOMBATHhőmérséklet", 243)
				.put("ESZOMBATHszinoptikusszélirány", 244)
				.put("ESZOMBATHszinoptikusszélsebesség", 245)
				.put("ESZOMBATHműszerszintilégnyomás", 246)
				.put("ESZOMBATHrelatívnedvesség", 247)
				.put("ESZOMBATHösszfelhőzet", 248)
				.put("ESZOMBATHcsapadékösszeg", 249)
				.put("ESZOMBATHjellemzőcsapadékalakkód", 250)
				.put("ESZOMBATHcsapadékösszegvonatkozásiideje", 251)
				.put("KSZOMBATHhőmérséklet", 252)
				.put("KSZOMBATHszinoptikusszélirány", 253)
				.put("KSZOMBATHszinoptikusszélsebesség", 254)
				.put("KSZOMBATHműszerszintilégnyomás", 255)
				.put("KSZOMBATHrelatívnedvesség", 256)
				.put("KSZOMBATHösszfelhőzet", 257)
				.put("KSZOMBATHcsapadékösszeg", 258)
				.put("KSZOMBATHjellemzőcsapadékalakkód", 259)
				.put("KSZOMBATHcsapadékösKSZOMBATHvonatkozásiideje", 260)
				.put("KSZOMBATHhőmérsékletÓRÁNKÉNTIVÁLTOZÁS", 261)
				.put("KSZOMBATHszinoptikusszélirányÓRÁNKÉNTIVÁLTOZÁS", 262)
				.put("KSZOMBATHszinoptikusszélsebességÓRÁNKÉNTIVÁLTOZÁS", 263)
				.put("KSZOMBATHműszerszintilégnyomásÓRÁNKÉNTIVÁLTOZÁS", 264)
				.put("KSZOMBATHrelatívnedvességÓRÁNKÉNTIVÁLTOZÁS", 265)
				.put("GYŐRhőmérséklet", 266)
				.put("GYŐRhőmérsékletváltozás", 267)
				.put("NAGYKANIZSAhőmérséklet", 268)
				.put("NAGYKANIZSAhőmérsékletváltozás", 269)
				.put("SIÓFOKÓRÁSHÖM", 270).put("SIÓFOKÓHÖMVÁLT", 271)
				.put("népkat", 272).put("filter_$", 273)
				.put("KözépDunántúl", 274).put("NyugatDunántúl", 275)
				.put("DélDunántúl", 276).put("ÉszakMagyarország", 277)
				.put("ÉszakAlföld", 278).put("KözépMagyarország", 279)
				.put("DélAlföld", 280).put("Budapest", 281).put("Baranya", 282)
				.put("BácsKiskun", 283).put("Békés", 284)
				.put("BorsodAbaújZemplén", 285).put("Csongrád", 286)
				.put("Fejér", 287).put("GyőrMosonSopron", 288)
				.put("HajdúBihar", 289).put("Heves", 290)
				.put("KomáromEsztergom", 291).put("Nógrád", 292)
				.put("Pest", 293).put("Somogy", 294)
				.put("SzabolcsSzatmárBereg", 295)
				.put("JászNagykunSzolnok", 296).put("Tolna", 297)
				.put("Vas", 298).put("Veszprém", 299).put("Zala", 300)
				.put("főváros", 301).put("megyeszékhely", 302)
				.put("város", 303).put("nagyközség", 304).put("község", 305)
				.put("Százezeréstöbb", 306).put("övenésszáz", 307)
				.put("harmincésötven", 308).put("huszésharminc", 309)
				.put("tizéshusz", 310).put("ötéstiz", 311)
				.put("háromésöt", 312).put("kettőéshárom", 313)
				.put("egyéskettő", 314).put("ötszázésezer", 315)
				.put("ötszázalatt", 316).put("ÖSZEVONTNAPSZAK", 317)
				.put("ÉVNAPSZAK", 318).put("ÉVHÓNAPÖSSZNAPSZAK", 319)
				.put("ÉVNAPÉVISORSZÁMA", 320).build();
	}

	public int getIdByName(String Name) {
		return dictionary.get(Name);
	}

	public String getNameById(int ID) {
		return dictionary.inverse().get(ID);
	}
}
