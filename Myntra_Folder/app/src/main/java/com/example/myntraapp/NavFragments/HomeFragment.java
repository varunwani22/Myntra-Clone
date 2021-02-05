package com.example.myntraapp.NavFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myntraapp.R;
import com.example.myntraapp.SearchActivity;
import com.example.myntraapp.ViewPagerAdapterHomeFirstFrag;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    private ImageView mRoundImageOne, mRoundImageTwo, mRoundImageThree, mRoundImageFour, mRoundImageFive, mRoundImageSix, mRoundImageSeven, mRoundImageEight;
    private ImageView mBestBuysImageOne, mBestBuysImageTwo, mBestBuysImageThree, mBestBuysImageFour;
    private ImageView mGlowUpSaleImage;
    private ImageView mValentineImageOne, mValentineImageTwo, mValentineImageThree, mValentineImageFour, mValentineImageFive;
    private ImageView mDealsOfTheImageOne, mDealsOfTheImageTwo, mDealsOfTheImageThree, mDealsOfTheImageFour, mDealsOfTheImageFive, mDealsOfTheImageSix;
    private ImageView mTrendsMenImageOne, mTrendsMenImageTwo, mTrendsMenImageThree, mTrendsMenImageFour, mTrendsMenImageFive;
    private ImageView mTrendsWomenImageOne, mTrendsWomenImageTwo, mTrendsWomenImageThree, mTrendsWomenImageFour, mTrendsWomenImageFive;
    private ImageView mTrendsKidsImageOne, mTrendsKidsImageTwo, mTrendsKidsImageThree, mTrendsKidsImageFour, mTrendsKidsImageFive;
    private ImageView mPremiumTitleImage, mPremiumImageOne, mPremiumImageTwo, mPremiumImageThree, mPremiumImageFour, mPremiumImageFive, mPremiumImageSix, mPremiumImageSeven;
    private ImageView mMostLovedTitle, mMostLovedImageOne, mMostLovedImageTwo, mMostLovedImageThree, mMostLovedImageFour, mMostLovedImageFive, mMostLovedImageSix, mMostLovedImageSeven, mMostLovedImageEight, mMostLovedImageNine;
    private ImageView mEndlessGiftsTitle, mEndlessGiftsImageOne, mEndlessGiftsImageTwo, mEndlessGiftsImageThree, mEndlessGiftsImageFour, mEndlessGiftsImageFive, mEndlessGiftsImageSix;
    private ImageView mBtnSearchProduct;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViewAndListeners(view);
        setViewPagerAdapterForHomeFirstFrag();
    }

    private void setViewPagerAdapterForHomeFirstFrag() {

        ViewPagerAdapterHomeFirstFrag viewPagerAdapterHomeFirstFrag = new ViewPagerAdapterHomeFirstFrag(getChildFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapterHomeFirstFrag);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initViewAndListeners(View view) {
        mBtnSearchProduct = view.findViewById(R.id.imageButton4);
        mBtnSearchProduct = view.findViewById(R.id.imageButton4);

        mBtnSearchProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });

        viewPager = view.findViewById(R.id.viewpager);
        tabLayout = view.findViewById(R.id.tabLayout);

        mRoundImageOne = view.findViewById(R.id.roundImageOne);
        mRoundImageTwo = view.findViewById(R.id.roundImageTwo);
        mRoundImageThree = view.findViewById(R.id.roundImageThree);
        mRoundImageFour = view.findViewById(R.id.roundImageFour);
        mRoundImageFive = view.findViewById(R.id.roundImageFive);
        mRoundImageSix = view.findViewById(R.id.roundImageSix);
        mRoundImageSeven = view.findViewById(R.id.roundImageSeven);
        mRoundImageEight = view.findViewById(R.id.roundImageEight);

        mBestBuysImageOne = view.findViewById(R.id.bestBuysImageOne);
        mBestBuysImageTwo = view.findViewById(R.id.bestBuysImageTwo);
        mBestBuysImageThree = view.findViewById(R.id.bestBuysImageThree);
        mBestBuysImageFour = view.findViewById(R.id.bestBuysImageFour);

        mGlowUpSaleImage = view.findViewById(R.id.glowUpSaleImage);

        mValentineImageOne = view.findViewById(R.id.valentinesImageOne);
        mValentineImageTwo = view.findViewById(R.id.valentinesImageTwo);
        mValentineImageThree = view.findViewById(R.id.valentinesImageThree);
        mValentineImageFour = view.findViewById(R.id.valentinesImageFour);
        mValentineImageFive = view.findViewById(R.id.valentinesImageFive);

        mDealsOfTheImageOne = view.findViewById(R.id.dealsOfTheImageOne);
        mDealsOfTheImageTwo = view.findViewById(R.id.dealsOfTheImageTwo);
        mDealsOfTheImageThree = view.findViewById(R.id.dealsOfTheImageThree);
        mDealsOfTheImageFour = view.findViewById(R.id.dealsOfTheImageFour);
        mDealsOfTheImageFive = view.findViewById(R.id.dealsOfTheImageFive);
        mDealsOfTheImageSix = view.findViewById(R.id.dealsOfTheImageSix);

        mTrendsMenImageOne = view.findViewById(R.id.trendsMenImageOne);
        mTrendsMenImageTwo = view.findViewById(R.id.trendsMenImageTwo);
        mTrendsMenImageThree = view.findViewById(R.id.trendsMenImageThree);
        mTrendsMenImageFour = view.findViewById(R.id.trendsMenImageFour);
        mTrendsMenImageFive = view.findViewById(R.id.trendsMenImageFive);

        mTrendsWomenImageOne = view.findViewById(R.id.trendsWomenImageOne);
        mTrendsWomenImageTwo = view.findViewById(R.id.trendsWomenImageTwo);
        mTrendsWomenImageThree = view.findViewById(R.id.trendsWomenImageThree);
        mTrendsWomenImageFour = view.findViewById(R.id.trendsWomenImageFour);
        mTrendsWomenImageFive = view.findViewById(R.id.trendsWomenImageFive);

        mTrendsKidsImageOne = view.findViewById(R.id.trendsKidsImageOne);
        mTrendsKidsImageTwo = view.findViewById(R.id.trendsKidsImageTwo);
        mTrendsKidsImageThree = view.findViewById(R.id.trendsKidsImageThree);
        mTrendsKidsImageFour = view.findViewById(R.id.trendsKidsImageFour);
        mTrendsKidsImageFive = view.findViewById(R.id.trendsKidsImageFive);

        mPremiumTitleImage = view.findViewById(R.id.premiumTitleImage);
        mPremiumImageOne = view.findViewById(R.id.premiumImageOne);
        mPremiumImageTwo = view.findViewById(R.id.premiumImageTwo);
        mPremiumImageThree = view.findViewById(R.id.premiumImageThree);
        mPremiumImageFour = view.findViewById(R.id.premiumImageFour);
        mPremiumImageFive = view.findViewById(R.id.premiumImageFive);
        mPremiumImageSix = view.findViewById(R.id.premiumImageSix);
        mPremiumImageSeven = view.findViewById(R.id.premiumImageSeven);

        mMostLovedTitle = view.findViewById(R.id.mostLovedTitle);
        mMostLovedImageOne = view.findViewById(R.id.mostLovedImageOne);
        mMostLovedImageTwo = view.findViewById(R.id.mostLovedImageTwo);
        mMostLovedImageThree = view.findViewById(R.id.mostLovedImageThree);
        mMostLovedImageFour = view.findViewById(R.id.mostLovedImageFour);
        mMostLovedImageFive = view.findViewById(R.id.mostLovedImageFive);
        mMostLovedImageSix = view.findViewById(R.id.mostLovedImageSix);
        mMostLovedImageSeven = view.findViewById(R.id.mostLovedImageSeven);
        mMostLovedImageEight = view.findViewById(R.id.mostLovedImageEight);
        mMostLovedImageNine = view.findViewById(R.id.mostLovedImageNine);

        mEndlessGiftsTitle = view.findViewById(R.id.endlessGiftsTitle);
        mEndlessGiftsImageOne = view.findViewById(R.id.endlessGiftsImageOne);
        mEndlessGiftsImageTwo = view.findViewById(R.id.endlessGiftsImageTwo);
        mEndlessGiftsImageThree = view.findViewById(R.id.endlessGiftsImageThree);
        mEndlessGiftsImageFour = view.findViewById(R.id.endlessGiftsImageFour);
        mEndlessGiftsImageFive = view.findViewById(R.id.endlessGiftsImageFive);
        mEndlessGiftsImageSix = view.findViewById(R.id.endlessGiftsImageSix);


        Glide.with(getContext()).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/2020/11/24/9ac88b8e-b25d-4bee-af1c-31daa40c9b351606197318523-top-nav_13.jpg").into(mRoundImageOne);
        Glide.with(mRoundImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/2020/11/24/b652559e-c9b3-483a-91f7-0d3979a7d8921606197318572-top-nav_15.jpg").into(mRoundImageTwo);
        Glide.with(mRoundImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/2020/11/24/ea6e4bdf-7677-4ebd-ae31-7ee6f0e97af61606197318629-top-nav_17.jpg").into(mRoundImageThree);
        Glide.with(mRoundImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/2020/11/24/77b49dae-fb0d-4a86-8fac-08d6c3200f381606197318683-top-nav_19.jpg").into(mRoundImageFour);
        Glide.with(mRoundImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/2020/11/24/a8733f3a-73cf-4c3d-90d7-f2b67f2c0fe31606197318287-top-nav_03.jpg").into(mRoundImageFive);
        Glide.with(mRoundImageSix).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/retaillabs/2020/11/27/d5c64f1e-9823-4947-afaf-63634b34ec5f1606488786961-footwear-top-nav.jpg").into(mRoundImageSix);
        Glide.with(mRoundImageSeven).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/2020/11/24/0a5537f4-1882-4cd7-bbfd-834015ae9edb1606197318466-top-nav_10.jpg").into(mRoundImageSeven);
        Glide.with(mRoundImageEight).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_200,c_limit,fl_progressive/assets/images/2020/11/24/433a2f62-7bd4-468e-b40c-ce76dffe3ffc1606197318416-top-nav_08.jpg").into(mRoundImageEight);

        Glide.with(mBestBuysImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/24/d5c9dee8-45a0-4d83-8b4c-ed07964ff4331606201451874-TOPS.jpg").into(mBestBuysImageOne);
        Glide.with(mBestBuysImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/24/fd7be88f-7cf8-4688-8aa9-12003a3f9c941606201451395-KURTAS.jpg").into(mBestBuysImageTwo);
        Glide.with(mBestBuysImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/24/4e748a47-b99d-4bd9-a0df-a94fadba21451606201451549-Sarees.jpg").into(mBestBuysImageThree);
        Glide.with(mBestBuysImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/24/85858e7a-b8ec-458e-bbf0-a009f2b00c451606201451076-DRESSES.jpg").into(mBestBuysImageFour);

        Glide.with(mGlowUpSaleImage).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/retaillabs/2021/2/2/380e26a8-f6da-4aa2-a0b3-0a929edbae5e1612253273160-HP-Vday-MainBannerOp3.jpg").into(mGlowUpSaleImage);

        Glide.with(mValentineImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/2/05e493b9-db4d-464b-8567-26e80e9c76371612256390067-VDayCorner-Dressberry.jpg").into(mValentineImageOne);
        Glide.with(mValentineImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/e43ec8de-ccb6-44a1-b017-0837a91cd84d1612176167282-VDayCorner-handbags.jpg").into(mValentineImageTwo);
        Glide.with(mValentineImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/dc0b8381-ae87-4de7-b727-0702cc01f0531612176167246-VDayCorner-chumbak.jpg").into(mValentineImageThree);
        Glide.with(mValentineImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/9c9e89de-a0dd-49e6-9b23-383d0700f6271612176167263-VDayCorner-DanielWellington.jpg").into(mValentineImageFour);
        Glide.with(mValentineImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/2eeb587b-a93d-476e-a0d6-53d5b3be551a1612176167327-VDayCorner-laceaffair.jpg").into(mValentineImageFive);

        Glide.with(mDealsOfTheImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/e0be76e7-a1e3-483d-8820-d3ee0ea91cd21612192533857-Extra5.jpg").into(mDealsOfTheImageOne);
        Glide.with(mDealsOfTheImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/retaillabs/2021/2/2/ae064027-074b-41a9-8c24-f4d55532914d1612244604319-Wonder-Hour--5-.jpg").into(mDealsOfTheImageTwo);
        Glide.with(mDealsOfTheImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/28b4f6eb-a8a4-46e4-b57b-982880404bc11612192533844-Starting-99.jpg").into(mDealsOfTheImageThree);
        Glide.with(mDealsOfTheImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/9c324aaa-8ddd-48b1-894e-d89b2a6f65a21612192533832-Under999.jpg").into(mDealsOfTheImageFour);
        Glide.with(mDealsOfTheImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/3a2d315d-e1b2-48fc-96e7-12eb373842aa1612192533872-40-70--1-.jpg").into(mDealsOfTheImageFive);
        Glide.with(mDealsOfTheImageSix).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/cef5eb56-c688-41c6-97a1-847c4bd3710c1612192637803-unnamed--4-.jpg").into(mDealsOfTheImageSix);

        Glide.with(mTrendsMenImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/53372e5b-a2fa-45cb-b108-a7cd47a7a55e1611313410388-Content-MustHavesMen-WO1VarsityTees.jpg").into(mTrendsMenImageOne);
        Glide.with(mTrendsMenImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/26f12fae-4977-4ae5-b184-67d593d8865f1611313410331-Content-MustHavesMen-WO1CheckedShirt.jpg").into(mTrendsMenImageTwo);
        Glide.with(mTrendsMenImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/fb59aab3-733e-4ba2-bb85-edac2ac337a61611313410346-Content-MustHavesMen-WO1ColouredChinos.jpg").into(mTrendsMenImageThree);
        Glide.with(mTrendsMenImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/832e2e91-da68-4bc6-9582-98b3e3573f1d1611313410318-Content-MustHavesMen-WO1BikerJackets.jpg").into(mTrendsMenImageFour);
        Glide.with(mTrendsMenImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/a7eeb4fc-c507-4481-bfe7-1c61d91a141a1611313410362-Content-MustHavesMen-WO1CrewNeckPullover.jpg").into(mTrendsMenImageFive);

        Glide.with(mTrendsWomenImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/29a01ce4-9129-4627-b3b3-0c58f9a1bd861611313677856-Content-MustHavesWomen-WORuchedStyles.jpg").into(mTrendsWomenImageOne);
        Glide.with(mTrendsWomenImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/1a222d62-5043-4908-9350-4ca0d3409b1d1611313677826-Content-MustHavesWomen-WOEthnicBottoms-.jpg").into(mTrendsWomenImageTwo);
        Glide.with(mTrendsWomenImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/ad016fc8-95e3-45e4-9abf-4707104a9c831611313677871-Content-MustHavesWomen-WOTieDetail.jpg").into(mTrendsWomenImageThree);
        Glide.with(mTrendsWomenImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/cd4e5c95-d784-4fdb-8c46-2211e97d8aaa1611313677800-Content-MustHavesWomen-WO1Basictees.jpg").into(mTrendsWomenImageFour);
        Glide.with(mTrendsWomenImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/63c8b2b3-f254-4347-b7cf-48b511d6592f1611313677813-Content-MustHavesWomen-WOComfortBottomwear.jpg").into(mTrendsWomenImageFive);

        Glide.with(mTrendsKidsImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/1c078ac2-a17a-47b0-b1f1-952c557d2e681611313935789-Content-MustHavesKids-WOComfortTrousers.jpg").into(mTrendsKidsImageOne);
        Glide.with(mTrendsKidsImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/1f888fd0-0dfe-459f-b4fe-24b5b2644dd71611313935818-Content-MustHavesKids-WOGraphicTees.jpg").into(mTrendsKidsImageTwo);
        Glide.with(mTrendsKidsImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/238c2b6e-65e9-4918-8a74-59727ba5c9901611313935833-Content-MustHavesKids-WOOnesies.jpg").into(mTrendsKidsImageThree);
        Glide.with(mTrendsKidsImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/10b62d69-4ace-4562-ac63-858f19122f901611313935863-Content-MustHavesKids-WOVolumeDresses.jpg").into(mTrendsKidsImageFour);
        Glide.with(mTrendsKidsImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/1/22/ea706ab0-2e3a-4f69-af00-31fe6f2b291e1611313935802-Content-MustHavesKids-WODenimStory.jpg").into(mTrendsKidsImageFive);

        Glide.with(mPremiumTitleImage).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/bd49cf19-48cf-4093-9aa5-1b554a36fec81595597921346-Header-premiumGifting51.jpg").into(mPremiumTitleImage);
        Glide.with(mPremiumImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/ad519972-2759-403a-9ca5-c922e2d2a7941595597923569-PremiumGifting-Makeup_Skincare52.jpg").into(mPremiumImageOne);
        Glide.with(mPremiumImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/d392362e-653d-43df-9014-4708fab8f1d31595597923658-PremiumGifting-Sneakers53.jpg").into(mPremiumImageTwo);
        Glide.with(mPremiumImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/24e4cf9e-6c3d-46fd-a4ba-d1c7697461301595597923466-PremiumGifting-Dinner_serveware54.jpg").into(mPremiumImageThree);
        Glide.with(mPremiumImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/49db635b-6825-4465-9e99-a32e6f62df781595597923611-PremiumGifting-Perfumes55.jpg").into(mPremiumImageFour);
        Glide.with(mPremiumImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/079608dd-0b66-4a61-b849-eca214aee8941595597923716-PremiumGifting-Watches56.jpg").into(mPremiumImageFive);
        Glide.with(mPremiumImageSix).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/8a360f97-9050-40d7-bd22-6488ddbd645e1595597923413-PremiumGifting-Bags_Wallets57.jpg").into(mPremiumImageSix);
        Glide.with(mPremiumImageSeven).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/e3b2a192-2f3b-4814-8a01-726ed99dfc3f1595597923514-PremiumGifting-Jewellry58.jpg").into(mPremiumImageSeven);

        Glide.with(mMostLovedTitle).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/3564c2a7-4dc6-4f93-b083-d35f73e092531595597921715-Header-Mostlovedbrands67.jpg").into(mMostLovedTitle);
        Glide.with(mMostLovedImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/d8aea9be-9cd8-466c-a91f-54154e1c17b31604392381234-Mostlovedbrands-Guess.jpg").into(mMostLovedImageOne);
        Glide.with(mMostLovedImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/87072b17-ff39-4782-a3fd-3669037c6da11604392381196-Mostlovedbrands-LaOpala.jpg").into(mMostLovedImageTwo);
        Glide.with(mMostLovedImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/59bb0edf-cabd-4db6-a5ac-997979dedcc61604392381160-Mostlovedbrands-MAC.jpg").into(mMostLovedImageThree);
        Glide.with(mMostLovedImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/retaillabs/2020/11/4/7bba73d3-dd95-4224-a417-ff8930b620a71604496571498-Gift-store.jpg").into(mMostLovedImageFour);
        Glide.with(mMostLovedImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/a7c41ddf-1373-4024-8f0b-8281198c07ca1604390049132-Mostlovedbrands-ManCompany.jpg").into(mMostLovedImageFive);
        Glide.with(mMostLovedImageSix).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/ff979128-3615-4868-aaad-74b41cd09a131604390049229-Mostlovedbrands-Amazfit.jpg").into(mMostLovedImageSix);
        Glide.with(mMostLovedImageSeven).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/597c02d7-f281-47b8-84ea-0095cf137fe41604392381028-Mostlovedbrands-Sepia.jpg").into(mMostLovedImageSeven);
        Glide.with(mMostLovedImageEight).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/da3d3c1a-335e-4412-a9c7-784ef7ccfed31604392381123-Mostlovedbrands-BigSmall.jpg").into(mMostLovedImageEight);
        Glide.with(mMostLovedImageNine).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/11/3/cfe8effc-afc8-4450-8ea1-578a36358bfc1604392381074-Mostlovedbrands-DaMilano.jpg").into(mMostLovedImageNine);

        Glide.with(mEndlessGiftsTitle).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/a4d38c7b-85c6-4dd5-a693-ad1b59d680891595597921558-Header-gifts-by-relation27.jpg").into(mEndlessGiftsTitle);
        Glide.with(mEndlessGiftsImageOne).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/8ed592cd-6d88-4d71-be6a-c7a236d57b931595597921243-GiftsbyRelations-PartnerorDate32.jpg").into(mEndlessGiftsImageOne);
        Glide.with(mEndlessGiftsImageTwo).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/5b97f437-f1e4-43d8-a2fa-5e4064a1eb611595597921027-GiftsbyRelations-friends_Sibling28.jpg").into(mEndlessGiftsImageTwo);
        Glide.with(mEndlessGiftsImageThree).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/3d333d73-4e5e-404b-bae1-88467056e52f1595597921181-GiftsbyRelations-parents29.jpg").into(mEndlessGiftsImageThree);
        Glide.with(mEndlessGiftsImageFour).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/d37358d9-0286-4724-acd8-dd85ccb699541595597921125-GiftsbyRelations-Kids31.jpg").into(mEndlessGiftsImageFour);
        Glide.with(mEndlessGiftsImageFive).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/8cc98a69-e6ef-4565-9043-8d60fef514971595597920988-GiftsbyRelations-colleague30.jpg").into(mEndlessGiftsImageFive);
        Glide.with(mEndlessGiftsImageSix).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2020/7/24/0b52bbf4-4fcd-40fe-bbf0-d1ac42a826a21595597921071-GiftsbyRelations-GrandParents33.jpg").into(mEndlessGiftsImageSix);

    }
}