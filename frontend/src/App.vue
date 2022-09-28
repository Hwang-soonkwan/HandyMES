

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        handymes
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
                    ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>


                    <v-list-item
                        class="px-2"
                        key="users"
                        to="/users"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        User
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="companies"
                        to="/companies"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Company
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="machines"
                        to="/machines"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Machine
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="products"
                        to="/products"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Product
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="progresses"
                        to="/progresses"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Progress
                    </v-list-item>



                    <v-list-item
                        class="px-2"
                        key="commands"
                        to="/commands"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Command
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="workjobs"
                        to="/workjobs"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Workjob
                    </v-list-item>



                    <v-list-item
                        class="px-2"
                        key="purchaseOrders"
                        to="/purchaseOrders"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        PurchaseOrder
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="purchaseIns"
                        to="/purchaseIns"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        PurchaseIn
                    </v-list-item>




                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container v-if="urlPath" class="py-8 px-6 mt-10" fluid>
                <router-view></router-view>
            </v-container>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="users"
                                    to="/users"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    User
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="companies"
                                    to="/companies"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Company
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="machines"
                                    to="/machines"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Machine
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="products"
                                    to="/products"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Product
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="progresses"
                                    to="/progresses"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Progress
                                </v-btn>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="commands"
                                    to="/commands"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Command
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="workjobs"
                                    to="/workjobs"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Workjob
                                </v-btn>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="purchaseOrders"
                                    to="/purchaseOrders"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    PurchaseOrder
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="purchaseIns"
                                    to="/purchaseIns"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    PurchaseIn
                                </v-btn>
                            </v-card-actions>
                        </v-card>

                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",

    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
    }
};
</script>
<style>
</style>
