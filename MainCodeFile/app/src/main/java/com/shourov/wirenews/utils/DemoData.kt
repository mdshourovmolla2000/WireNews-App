package com.shourov.wirenews.utils

import com.shourov.wirenews.R
import com.shourov.wirenews.model.CategoryModel
import com.shourov.wirenews.model.NewsModel

class DemoData {

    fun topNewsCategoryData(): Array<String> {
        return arrayOf("All", "Economy", "Sports", "Politics", "Science", "More")
    }

    fun categoryItemData(): List<CategoryModel>{
        val itemList: ArrayList<CategoryModel> = ArrayList()
        itemList.add(CategoryModel(R.drawable.category_image_1,"Politics"))
        itemList.add(CategoryModel(R.drawable.category_image_2,"Economy"))
        itemList.add(CategoryModel(R.drawable.category_image_3,"Technology"))
        itemList.add(CategoryModel(R.drawable.category_image_4,"Entertainment"))
        itemList.add(CategoryModel(R.drawable.category_image_5,"Sports"))
        itemList.add(CategoryModel(R.drawable.category_image_6,"Health"))
        itemList.add(CategoryModel(R.drawable.category_image_7,"Science"))
        itemList.add(CategoryModel(R.drawable.category_image_8,"Education"))
        itemList.add(CategoryModel(R.drawable.category_image_9,"Environment"))
        itemList.add(CategoryModel(R.drawable.category_image_10,"Lifestyle"))
        itemList.add(CategoryModel(R.drawable.category_image_11,"Travel"))
        itemList.add(CategoryModel(R.drawable.category_image_12,"Food"))
        itemList.add(CategoryModel(R.drawable.category_image_13,"Fashion"))
        itemList.add(CategoryModel(R.drawable.category_image_14,"Art"))
        itemList.add(CategoryModel(R.drawable.category_image_15,"Crime"))
        return itemList
    }

    fun newsItemData(): List<NewsModel>{
        val itemList: ArrayList<NewsModel> = ArrayList()
        itemList.add(NewsModel(R.drawable.politics_news_cover_image_1,"Politics", "A group of doctors led by Jahidul Bari join Jatiya Party", "Jatiya Chikitshak Parishad, a physicians’ body of the main opposition in parliament Jatiya Party, has started its journey on Thursday.\n" +
                "\n" +
                "The new 101 member committee of the Jatiya Chikitshak Parishad has been formed with convener Prof Dr Jahidul Bari and member secretary Dr Khaled Sufian.\n" +
                "\n" +
                "Jatiya Party chairman GM Quader, also deputy leader of the opposition in parliament inaugurated the organization at a programme at the party’s Banani office in the capital in the afternoon.\n" +
                "Speaking at the programme, he said the country’s health sector has turned into room of corruption as the patients and physicians are being affected due to the corruption.\n" +
                "\n" +
                "“The health sector concerned bureaucrats and businessmen have been plundering crores of money and siphoning off the money abroad. The corruption took place more than the success in facing the coronavirus pandemic,” he said.\n" +
                "\n" +
                "A group of physicians under the leadership of Dr Jahidul Bari also formally joined the party at the programme.\n" +
                "\n" +
                "Jatiya Party secretary general Mujibul Haque Chunnu and co chairman Syed Abu Hossain Babla also spoke at the function among others."))
        itemList.add(NewsModel(R.drawable.politics_news_cover_image_2,"Politics", "BNP discusses movement strategy with Gonoforum, People’s Party", "BNP on Saturday discussed the strategy and next course of action of the ongoing simultaneous movement with a faction of Gonoforum and People's Party.\n" +
                "\n" +
                "The members of the liaison committees of BNP and Gonoforum and People's Party had a nearly one and a half hours meeting at the BNP Chairperson's Gulshan office.\n" +
                "\n" +
                "BNP secretary general Mirza Fakhrul Islam Alamgir was present at the meeting as a special guest.\n" +
                "\n" +
                "Talking to reporters after the meeting, BNP standing committee member Amir Khosru Mahmud Chowdhury said they discussed how to strengthen and intensify the ongoing simultaneous movement.\n" +
                "\n" +
                "“We also talked about our possible action programmes and the nature of the movement to make it a success,” he said.\n" +
                "\n" +
                "Khosru said BNP together with other opposition parties will move the movement forward with effective programs as the freedom-loving people of the country are looking forward to the success of the movement.\n" +
                "\n" +
                "“We'll continue our simultaneous movement until we get the victory,” he said.\n" +
                "\n" +
                "Gonoforum President Mostafa Mohsin Montu said they discussed with BNP leaders how to strengthen the ongoing movement.\n" +
                "\n" +
                "He said their movement will surely turn successful with the huge support of people.\n" +
                "\n" +
                "Apart from Khosru and Montu, BNP vice-chairman Barkatullah Bulu and joint secretary general Sayed Moazzem Hossain Alal, Gonoforum leaders Subrata Chowdhury, Prof Abu Sayeed, AKM Jaglul Haider Afrik, Mohiuddin Abdul Quader."))
        itemList.add(NewsModel(R.drawable.economy_news_cover_image_1,"Economy", "Meghna Bank, BFDS launch services for freelancers", "Meghna Bank recently partnered with Bangladesh Freelancer Development Society (BFDS) to launch its new product \"Freelancer Account Service Pack\".\n" +
                "\n" +
                "To this end, both the organisations signed a memorandum of understanding (MoU) at the bank's head office in Gulshan Dhaka, said a press release.\n" +
                "\n" +
                "Tanjiba Rahman, president of the BFDS, and Sohail RK Hussain, managing director and CEO of Meghna Bank, inked the MoU.\n" +
                "\n" +
                "Under the MoU, freelancer account holders will receive inclusive banking benefits like remittance services, foreign currency deposit in ERQ account and digital remittance certificate as an express service.\n" +
                "\n" +
                "The bank has already established a dedicated desk at its head office, and branches will be the exclusive contact point for freelancers across the country.\n" +
                "\n" +
                "\"The Meghna freelancer account pack is indeed an excellent addition aimed to serve more than 650,000 freelancing professionals who expect to enjoy hassle-free banking experience,\" said Hussain."))
        itemList.add(NewsModel(R.drawable.economy_news_cover_image_2,"Economy", "China will provide buyer's credit in Yuan", "China wants to use its Yuan as financing currency instead of the US dollar for projects to be funded under preferential buyer's credit (PBC) to skip forex complications.\n" +
                "\n" +
                "The Export-Import (Exim) Bank of China has proposed to Bangladesh that it wants to finance the PBC- funded projects partly or fully with Yuan amid severe fluctuation in the dollar rate that nearly emptied many countries' forex reserves.\n" +
                "\n" +
                "In a recent letter to the Economic Relations Division, LI Qinxi, a general manager of the Chinese bank, wrote that the bank had successfully financed a batch of projects under PBC and governmental concessional -loan (GCL) facility which generated good social and economic benefits.\n" +
                "\n" +
                "He said the PBC loan comprises the major portion of them and there was still potential for bilateral cooperation with the PBC facility.\n" +
                "\n" +
                "\"However, in view of the current significant fluctuations in the US dollar exchange rate accompanied with the interest-rate-benchmark hike by the Federal Reserve, both sides are bearing significant risks such as high financing cost, exchange-rate risk etc,\" the letter read.\n" +
                "\n" +
                "The rising cost for the USD in the market may also lead to interest-rate increase for the following PBC- financed projects, he wrote.\n" +
                "\n" +
                "Using Yuan as the financing currency could distract the risk borne by the fluctuation in USD exchange rate as well as interest rate and relieve stress stemming from the shortage of USD.\n" +
                "\n" +
                "The Yuan financing could reduce the exchange- rate cost, which, therefore, could provide a favourable position to reduce the total investment for implementing the project.\n" +
                "\n" +
                "Bangladesh recently opted to make transactions with China using Yuan amid severe shortage of US dollars.\n" +
                "\n" +
                "To this effect, the Bangladesh Bank in last September allowed the authorized dealer banks (ADs) to carry out transactions in Yuan for trade with China alongside the dollar.\n" +
                "\n" +
                "The central bank in its order said: \"To bring a wider scope, it has been decided that ADs may maintain accounts in Yuan with their correspondents/branches abroad for settlement of cross-border transactions executed in this currency.\"\n" +
                "\n" +
                "Last year's order followed another order issued in 2018 which allowed the dealer banks to open foreign- currency clearing accounts with Bangladesh Bank in the Chinese currency.\n" +
                "\n" +
                "China, in recent times, has been building an alternative payments system called 'cross-border inter-bank payments system (CIPS)'.\n" +
                "\n" +
                "Bangladesh earns around \$1 billion by exporting goods to China while imports from the vast economy are worth \$15 billion annually."))
        itemList.add(NewsModel(R.drawable.technology_news_cover_image_1,"Technology", "Nokia reportedly launching a high-end smartphone", "Nokia is reportedly set to launch a new high-end smartphone, according to leaked information from respected tech outlet WinFuture.\n" +
                "\n" +
                "According to WinFuture and Android Authority, the Nokia XR21, the successor to the XR20, is said to be equipped with a budget-tier Snapdragon 695 chipset, offering an upgrade in CPU and a smaller manufacturing process compared to its predecessor. The device will also feature a 6.49-inch FHD+ LCD screen with a 120Hz refresh rate and Gorilla Glass Victus protection, 6GB of RAM, and 128GB of storage.\n" +
                "\n" +
                "A standout feature of the new device is expected to be its 33W wired charging, which is a significant upgrade over the XR20's 18W charging speeds. The device is also said to be dust and water-resistant with an IP68 rating.\n" +
                "\n" +
                "The Nokia XR21 is reportedly set to be available in black and green colour options, featuring a plastic rear cover and thick bezels similar to its predecessor. However, it is disappointing to note that the device will reportedly ship with Android 12, despite Android 13 being available for roughly eight months.\n" +
                "\n" +
                "In terms of camera specifications, the Nokia XR21 will feature a 64MP main camera and an 8MP telephoto camera with up to 8x digital zoom. However, neither camera will offer optical stabilization hardware, and the Snapdragon 695 chipset doesn't support 4K recording. The device will also feature a 16MP camera for selfies and video calls.\n" +
                "\n" +
                "Other details about the device include a 3.5mm port, eSIM support, an extra hardware key on the left-hand side, presumably for Google Assistant, and a top-mounted customizable button, similar to the older device.\n" +
                "\n" +
                "The Nokia XR21 will reportedly come with three years of major OS updates and four years of security patches. The device is expected to be a budget-friendly option for smartphone users seeking a high-end experience without breaking the bank.\n" +
                "\n" +
                "While Nokia has yet to officially announce the device, WinFuture's detailed leak has certainly generated excitement among smartphone enthusiasts."))
        itemList.add(NewsModel(R.drawable.sports_news_cover_image_1,"Sports", "Yamal becomes Barca's youngest ever La Liga player", "Barcelona brought on 15-year-old forward Lamine Yamal in their 4-0 win over Real Betis on Saturday to make him their youngest ever player in La Liga.\n" +
                "\n" +
                "The Catalan club said he was their second youngest player of all time, behind Albert Almasque in 1902 who played in the Macaya cup at 13 years, 11 months and six days old.\n" +
                "\n" +
                "The winger replaced Gavi with four minutes plus stoppage time remaining to make his debut at 15 years, nine months and 16 days old.\n" +
                "\n" +
                "\"He's got innate talent in the final third which is difficult to find,\" Xavi told reporters.\n" +
                "\n" +
                "\"He doesn't seem like he's 15 years old, he's more mature than his years. I've seen him train and he's showed it.\n" +
                "\n" +
                "\"He played 10 minutes, but did well, he can mark an era at the club.\" \nYamal had a shot on target during a bright cameo as Barcelona restored their 11 point lead at the top of the table.\n" +
                "\n" +
                "Xavi agreed with comparisons to Lionel Messi and Ansu Fati, who also make their debuts at young ages for the club.\n" +
                "\n" +
                "\"I told him to try things and he did,\" Xavi told Movistar.\n" +
                "\n" +
                "\"At 15 years old, just imagine it. He's a special player, he could score, assist, he had confidence.\n" +
                "\n" +
                "\"When you see it in training you realise he could be big.\"\n" +
                "\n" +
                "Yamal also created a chance for Ousmane Dembele with a scooped pass over the top for the French winger.\n" +
                "\n" +
                "Raphinha, who scored Barcelona's third goal against Betis, said the squad were all talking about Yamal's debut.\n" +
                "\n" +
                "\"We were talking about this on the bench, when I was 15 I think I was playing for my neighbourhood team,\" Barca winger Raphinha told Movistar.\n" +
                "\n" +
                "\"And seeing him come on in this stadium, with all these people, is incredible.\n" +
                "\n" +
                "\"It would have been better if he scored, but he will score at a better moment and he will be very important for the club.\""))
        return itemList
    }
}