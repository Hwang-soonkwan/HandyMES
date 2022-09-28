<template>
    <div>
        <v-list two-line v-if="list.length > 0">
            <v-list-item-group 
                    v-model="selected" 
                    color="indigo"
                    @change="select"
            >
                <v-list-item v-for="(item, idx) in list" :key="idx">
                    <template v-slot:default="{ active }">
                        <v-list-item-avatar color="grey darken-1">
                        </v-list-item-avatar>
                        
                        <v-list-item-content>
                            <v-list-item-title>
                            </v-list-item-title>
                            <v-list-item-subtitle>
                                Poidx :  {{item.poidx }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                TenantId :  {{item.tenantId }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                OrderYm :  {{item.orderYm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                OrderDt :  {{item.orderDt }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                CocompNo :  {{item.cocompNo }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                ProdNo :  {{item.prodNo }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                ProdNumber :  {{item.prodNumber }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                ProdNm :  {{item.prodNm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                ProdStandard :  {{item.prodStandard }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                OrderAmt :  {{item.orderAmt }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                RegiNm :  {{item.regiNm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                RegiTm :  {{item.regiTm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                ModiNm :  {{item.modiNm }}
                            </v-list-item-subtitle>
                            <v-list-item-subtitle>
                                ModiTm :  {{item.modiTm }}
                            </v-list-item-subtitle>
                        </v-list-item-content>

                        <v-list-item-action>
                            <v-checkbox :input-value="active" color="indigo"></v-checkbox>
                        </v-list-item-action>
                    </template>
                </v-list-item>
            </v-list-item-group>
        </v-list>
    </div>
</template>


<script>
    const axios = require('axios').default;

    export default {
        name: 'PurchaseOrderPicker',
        props: {
            value: [String, Object, Array, Number, Boolean],
        },
        data: () => ({
            list: [],
            selected: null,
        }),
        async created() {
            var me = this;
            var temp = await axios.get(axios.fixUrl('/purchaseOrders'))
            if(temp.data) {
                me.list = temp.data._embedded.purchaseOrders;
            }

            if(me.value && typeof me.value == "object" && Object.values(me.value)[0]) {
                var id = Object.values(me.value)[0];
                var tmpValue = await axios.get(axios.fixUrl('/purchaseOrders/' + id))
                if(tmpValue.data) {
                    var val = tmpValue.data
                    me.list.forEach(function(item, idx) {
                        if(item.name == val.name) {
                            me.selected = idx
                        }
                    })
                }
            }
        },
        methods: {
            select(val) {
                var obj = {}
                if(val != undefined) {
                    var arr = this.list[val]._links.self.href.split('/');
                    obj['poidx'] = arr[4]; 
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    this.$emit('selected', obj);
                }
            },
        },
    };
</script>

